package com.java.ejercicios.tema789;

import com.prueba.NameFormatException;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {


        String[] arr = new String[] {"a", "b", "c", "d", "e"};
        for (String str : arr) {
            out.println(str);
        }

        int[][] arr0 = new int[][] {{11,12,13,14,15},{21,22,23,24,25}};
        for (int j=0; j<arr0.length; j++) {
            for (int k=0; k<arr0[j].length; k++) {
                out.println("El valor del arr es: " + arr0[j][k] + " en posicion: " + j + " " + k);
            }
        }

        Vector<Integer> vecNumeros = new Vector<>();

        vecNumeros.add(10);
        vecNumeros.add(11);
        vecNumeros.add(12);
        vecNumeros.add(13);
        vecNumeros.add(14);
        vecNumeros.remove(1);
        vecNumeros.remove(1);
        out.println(vecNumeros);

        // El problema de usar un vector con capacidad por defecto si tenemos 1000 elementos es que cada que el
        // array aumente de tamaño se va a copiar el array y se duplicara el consumo del segundo array

        List<String> arr2 = new ArrayList<>();

        arr2.add("10");
        arr2.add("11");
        arr2.add("12");
        arr2.add("13");

        List<String> lArr = new LinkedList<>(arr2);

        for (Object o : lArr) {
            out.println(o);
        }

        for (Object o : arr2) {
            out.println(o);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<10; i++) {
            list.add(i);
        }

        for (int i = 0; i<list.size(); i++) {

            if (list.get(i)%2== 0) {
                list.remove(i);
            }
        }

        out.println(list);

        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            out.println("Esto no puede hacerse "+ e.getMessage());
        } finally {
            out.println("Demo de codigo");
        }

        out.println(reverse("pokemon"));


    }


    public static String reverse(@NotNull String texto) {

        String rText ="";
        int num;
        for (int i = 0; i<texto.length(); i++) {
            num = texto.length() - 1 - i;
            rText = rText + texto.charAt(num);
        }

        return rText;
    }

    public static void DividePorCero() throws ArithmeticException {
        throw new ArithmeticException();
    }

    public static void copiarFichero(String ficherInput, String ficherOutput) {

        try {
            InputStream fichero = new FileInputStream(ficherInput);
            byte[] contFichero = in.readAllBytes();
            PrintStream ficherSalida = new PrintStream(ficherOutput);
            out.write(contFichero);
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }
}
