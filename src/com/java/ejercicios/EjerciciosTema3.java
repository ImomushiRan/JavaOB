package com.java.ejercicios;

public class EjerciciosTema3 {

    public static void main(String[] args) {


        String[] arr = {"primernombre","segundonombre","tercernombre"} ;

        String textConcatenado = concatText(arr);
        System.out.println(textConcatenado);
    }

    public static String concatText(String[] arr) {
        String textConcatnado = "";
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length) {
                textConcatnado = textConcatnado + arr[i] + " ";
            } else {
                textConcatnado = textConcatnado + arr[i];
            }
        }
        return textConcatnado;
    }
}
