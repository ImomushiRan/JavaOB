package com.java.ejercicios;

public class EjerciciosTema2 {

    public static void main(String[] args) {

        System.out.println(prcioConIVA(100.1));

    }

    public static double prcioConIVA(double precioB) {

        double sumaIVA = 1.21;
        double precioT = precioB * sumaIVA;
        return precioT;
    }
}
