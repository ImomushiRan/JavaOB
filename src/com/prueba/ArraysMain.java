package com.prueba;

import curso.java.basico.Coche;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        String[] nombres1 = new String[3];
        String[] nombres2;
        //nombres2 = new String(nombre1,nombre2,nombre3
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres1[0] = nombre1;
        nombres1[1] = nombre2;
        nombres1[2] = nombre3;

        for (int i=0; i< nombres1.length; i++) {
            System.out.println(nombres1[i]);
        }

    }
}
