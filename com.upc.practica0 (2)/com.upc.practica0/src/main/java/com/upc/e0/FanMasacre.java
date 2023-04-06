package com.upc.e0;

public class FanMasacre extends Concursante {
    private int equipo;
    private Integer puntajeBarra;
    private Integer puntajeEquipo;

    public FanMasacre(String nombre, String apellido, Integer dni, Integer edad, Integer cantidadMensajeTexto, int equipo, Integer puntajeBarra, Integer puntajeEquipo) {
        super(nombre, apellido, dni, edad, cantidadMensajeTexto);
        this.equipo = equipo;
        this.puntajeBarra = puntajeBarra;
        this.puntajeEquipo = puntajeEquipo;
    }


    public Double CalculoPuntaje(){ //ESTE CAMBIAR DE NOMBRE
        return this.getCantidadMensajeTexto()*4+puntajeBarra+puntajeEquipo*2.0;
    }
    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public Integer getPuntajeBarra() {
        return puntajeBarra;
    }

    public void setPuntajeBarra(Integer puntajeBarra) {
        this.puntajeBarra = puntajeBarra;
    }

    public Integer getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(Integer puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    @Override
    public String toString() {
        return "FanMasacre{" +
                "equipo='" + equipo + '\'' +
                ", puntajeBarra=" + puntajeBarra +
                ", puntajeEquipo=" + puntajeEquipo +
                "} " + super.toString();
    }

}
