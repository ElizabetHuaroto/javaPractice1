package com.upc.e0;

public abstract class Concursante {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer edad;
    private Integer cantidadMensajeTexto;

    public Concursante(String nombre, String apellido, Integer dni, Integer edad, Integer cantidadMensajeTexto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cantidadMensajeTexto = cantidadMensajeTexto;
    }
    public abstract Double CalculoPuntaje();//AUIII
    @Override
    public String toString() {
        return "Fan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", cantidadMensajeTexto=" + cantidadMensajeTexto +
                '}';
    }

    public Integer getCantidadMensajeTexto() {
        return cantidadMensajeTexto;
    }

    public void setCantidadMensajeTexto(Integer cantidadMensajeTexto) {
        this.cantidadMensajeTexto = cantidadMensajeTexto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
