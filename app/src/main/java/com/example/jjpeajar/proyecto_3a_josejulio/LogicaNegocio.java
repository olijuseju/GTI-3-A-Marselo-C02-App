package com.example.jjpeajar.proyecto_3a_josejulio;

public class LogicaNegocio {
    public PeticionarioRest peticionarioRest = new PeticionarioRest();

    LogicaNegocio(){

    }

    public void publicarMecicion(MedicionC02 medicionC02){
        peticionarioRest.realizarPeticion("POST", "http://localhost:8000/api/lecturas",
                "{\"data\": \"" +
                        medicionC02.data +
                        "\", \"id_sensor\": \"" +
                        medicionC02.SensorId +
                        "\", \"longitud\": \"" +
                        medicionC02.longitud +
                        "\", \"latitud\": \"" +
                        medicionC02.latitud +
                        "\", }",
                new PeticionarioRest.RespuestaREST () {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                       // elTexto.setText ("cdigo respuesta: " + codigo + " <-> \n" + cuerpo);
                    }
                });
    }
}
