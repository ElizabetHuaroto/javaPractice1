package com.upc.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        // 1. paso) se crea una lista de objetos person
        List<Person> personasLista = Arrays.asList(
                new Person(123122,"Eli", 2002,Sex.Women),
                new Person(123122,"Carlo", 2016,Sex.Man),
                new Person(123122,"Ara", 2016,Sex.Man)


        );
        //se filtran las personas que cumplen la condición y se ordenan alfabeticamente
        List<String> nombres = personasLista.stream()
                .filter(p -> p.getSex()==Sex.Man && p.getBirthDate()%2==0 && p.getBirthDate()>2015)
               //lo convierte de stream de person a stream de nombres
                .map(Person::getName)
                .sorted()//para que se pongan en orden alfabetico
                .collect(Collectors.toList());
        System.out.println(nombres);
    }
}
