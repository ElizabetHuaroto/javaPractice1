package com.upc;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        double[] radios = {1.4, 2.9, 1.2, 8.8, 3.3, 4.5, 6.4, 5.1, 7.2, 8.9};

        // Ordena los radios en forma ascendente
        Arrays.sort(radios);

        // Imprimir las áreas de los círculos
        System.out.println("Áreas de los círculos en forma ascendente:");
        //lambda define una función
        //map hace  que de ese stream de radios te devuelva esa funcion
        Arrays.stream(radios).map(r -> Math.PI * r * r).forEach(System.out::println);

        // Calcular y mostrar la máxima área utilizando una expresión lambda
        double maxArea = Arrays.stream(radios).map(r -> Math.PI * r * r).max().getAsDouble();
        System.out.println("Máxima área: " + maxArea);
    }
}
