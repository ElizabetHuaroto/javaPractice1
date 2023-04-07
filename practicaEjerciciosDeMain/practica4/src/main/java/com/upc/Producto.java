package com.upc;

public class Producto {
private Integer id;
private String decripcion;
private Double precio;

    public Producto(Integer id, String decripcion, Double precio) {
        this.id = id;
        this.decripcion = decripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", decripcion='" + decripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
