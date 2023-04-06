package org.example;

import com.upc.e0.Concursante;
import com.upc.e0.FanMasacre;
import com.upc.e0.FanTelevidente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[]arg){
    Scanner input = new Scanner(System.in); //sirve para que spueda leer datos ingresados
    ArrayList<Concursante> concursantes= new ArrayList<>();
    while (true) {
        System.out.println("Ingrese una opción:");
        System.out.println("1.Registrar concursante");
        System.out.println("2.Mostrar ganador");
        System.out.println("3.Mostrar listado de concursantes");
        System.out.println("4. Salir");
        int opcion = input.nextInt(); //utilizado por el scanner para guardar el valor de la proxima enrtada de tipo int en la variable
        switch (opcion) {
            case 1:
                registraConcursante(concursantes);
                break;
            case 2:
                mostrarGanador(concursantes);
                break;

            case 3: MostrarTodosLosConcursantes(concursantes);
                 break;
            case 4:
                System.out.println("Saliendo del programa...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }
        //aqui va un switch
    }
}

        public static void registraConcursante(ArrayList<Concursante> concursantes){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrse que tipo de concursante es: 1.Masacre, 2: Televidente");
            int tipo = input.nextInt();

            System.out.println("Ingrese el nombre:");
            String nombre = input.next();

            System.out.println("Ingrese el apellido:");
            String apellido = input.next();

            System.out.println("Ingrese el DNI:");
            int dni = input.nextInt();

            System.out.println("Ingrese la edad:");
            int edad = input.nextInt();

            System.out.println("Ingrese cantidad de mensajes de texto:");
            int mensajesTexto = input.nextInt();

            System.out.println("Ingrese puntajeBarra");
            int puntajeBarra = input.nextInt();

           Integer puntajeMuerte=20;
           Integer puntajeDestruccion=30;
           Integer puntajenuclear=40;
           Integer puntajeEquipo=0;


            if (tipo == 1) {
                System.out.println("Ingrese el equipo al que pertenece (1. Equipo Muerte, 2. Equipo Destrucción, 3. Equipo Nuclear):");
                int equipo = input.nextInt();
                switch (equipo){
                    case 1: {puntajeEquipo=puntajeMuerte; FanMasacre fan = new FanMasacre(nombre, apellido, dni, edad,mensajesTexto ,equipo, puntajeBarra,puntajeEquipo);   concursantes.add(fan);puntajeEquipo=0;break;}
                    case 2:{puntajeEquipo=puntajeDestruccion;FanMasacre fan = new FanMasacre(nombre, apellido, dni, edad,mensajesTexto ,equipo, puntajeBarra,puntajeEquipo);   concursantes.add(fan);puntajeEquipo=0;break;}
                    case 3: {puntajeEquipo=puntajenuclear;FanMasacre fan = new FanMasacre(nombre, apellido, dni, edad,mensajesTexto ,equipo, puntajeBarra,puntajeEquipo);   concursantes.add(fan);puntajeEquipo=0; break;}

                }
                System.out.println("Fan Masacre registrado correctamente.");
            } else if (tipo == 2) {
                System.out.println("Ingrese el número de llamada:");
                int numeroLlamada = input.nextInt();

                System.out.println("Ingrese el número celular");
                int numeroCel= input.nextInt();
                FanTelevidente tele = new FanTelevidente(nombre, apellido, dni, edad,mensajesTexto,numeroCel, numeroLlamada);
                concursantes.add(tele);
                System.out.println("Televidente registrado correctamente.");
            } else {
                System.out.println("Opción inválida.");
            }}
    public static void mostrarGanador(ArrayList<Concursante> concursantes) {
        Concursante ganador = null;
        double maxPuntaje = 0;

        //metodo de la burbuja
        for (Concursante c : concursantes) {
            Double puntaje = c.CalculoPuntaje();
            if (puntaje > maxPuntaje) {
                maxPuntaje = puntaje;
                ganador = c;
            }
        }

        if (ganador == null)
        System.out.println("Todavía no hay 1 ganador");
        else{
            System.out.print(ganador.toString());
        }
    }
    public static void MostrarTodosLosConcursantes(ArrayList<Concursante>concursantes){

        System.out.println(concursantes.toString()); //de frente se imprimen todos

    }
}