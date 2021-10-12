package com.example.jjpeajar.proyecto_3a_josejulio;

public class LogicaNegocio {
    public PeticionarioRest peticionarioRest;

    public void publicarMecicion(){
        peticionarioRest.realizarPeticion("POST", "http://localhost:8000/api/lecturas",
                "{\"data\": \"A9182342W\", \"id_sensor\": \"Android\", }",
                new PeticionarioRest.RespuestaREST () {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                       // elTexto.setText ("cdigo respuesta: " + codigo + " <-> \n" + cuerpo);
                    }
                });
    }
}
