package com.upc.e0;

public class FanTelevidente extends Concursante {
    private Integer numeroCelular;
    private Integer catidadLlamadas;
    public FanTelevidente(String nombre, String apellido, Integer dni, Integer edad, Integer cantidadMensajeTexto, Integer numeroCelular, Integer catidadLlamadas) {
        super(nombre, apellido, dni, edad, cantidadMensajeTexto);
        this.numeroCelular = numeroCelular;
        this.catidadLlamadas = catidadLlamadas;
    }

    public Double CalculoPuntaje(){ //ESTE CAMBIAR DE NOMBRE
        return this.getCantidadMensajeTexto()*4+this.catidadLlamadas*3.0;
    }

    @Override
    public String toString() {
        return "FanTelevidente{" +
                "numeroCelular=" + numeroCelular +
                ", catidadLlamadas=" + catidadLlamadas +
                "} " + super.toString();
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Integer getCatidadLlamadas() {
        return catidadLlamadas;
    }

    public void setCatidadLlamadas(Integer catidadLlamadas) {
        this.catidadLlamadas = catidadLlamadas;
    }
}
