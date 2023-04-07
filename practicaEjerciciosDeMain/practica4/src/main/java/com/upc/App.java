package com.upc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
       List<Producto> productos = Arrays.asList(
                new Producto(12345678,"colador",34.0),
                new Producto(12345679,"Panqueque",3.0),
                new Producto(12345670,"Armario",3534.0)
        );

        Stream<Producto> productosStream = productos.stream();
        while (true) {
            System.out.println("Menú");
            System.out.println("1.ver producto");
            System.out.println("2.Buscar producto");
            System.out.println("3.Salir");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    VerListaProductoMasDescuentoyPrecioNeto(productos);
                    break;
                case 2:
                    System.out.println("Ingrese el ID");
                    int IDingresado= input.nextInt();
                    BuscarProductoConID(productos,IDingresado);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("opción invalida, ingrese una de nuevo");
                    break;
            }
        }
        }
       public static void  VerListaProductoMasDescuentoyPrecioNeto(List<Producto> productos){
            Double nuevoPrecio= 0.0;
            Double descuento=0.0;
            for(Producto p : productos ){
                if(p.getPrecio()>2000)
                    descuento=0.10;
                else descuento=0.0;
                nuevoPrecio= p.getPrecio()-p.getPrecio()*descuento;
                System.out.println(p+"Descuento:"+descuento+"Nuevo precio: "+nuevoPrecio);
                descuento=0.0;
            }


        }
        public static void  BuscarProductoConID(List<Producto> productos, int IDingresado){

            System.out.println("Buscando el producto con id " + IDingresado + "...");
            Producto productoEncontrado = productos.stream()
                    .filter(producto -> producto.getId() == IDingresado)
                    .findFirst()
                    .orElse(null);

            if (productoEncontrado == null) {
                System.out.println("No se encontró ningún producto con id " + IDingresado);
            } else {
                System.out.println("Producto encontrado: " + productoEncontrado);
            }
        }
    }

