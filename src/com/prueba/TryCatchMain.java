package com.prueba;

public class TryCatchMain {

    public static void main(String[] args) {

        // Codigo que conecta con una base de datos
        // o con un servicio externo el codigo nos va a dar un problema

        try {
            int result = 5/ 5;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");

    }
}
