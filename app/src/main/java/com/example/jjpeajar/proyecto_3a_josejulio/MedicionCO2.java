package com.example.jjpeajar.proyecto_3a_josejulio;

public class MedicionCO2 {

    public String fecha;
    public String sensorId;
    public String usuarioId;

    public int latitud;
    public int longitud;

    public MedicionCO2(String fecha, String sensorId, String usuarioId, int latitud, int longitud) {
        this.fecha = fecha;
        this.sensorId = sensorId;
        this.usuarioId = usuarioId;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public MedicionCO2() {    }


}
