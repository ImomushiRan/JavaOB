package curso.java.basico;

/* Primero cuando generamos un projecto en java se nos abre la estructura de intellij
 y se nos geenera una carpeta llamada "src o sources", que es la que va a almacenar el codigo
 fuente o los archivos .java

 Lo primero que se hace es crear primero un package o un paquete, que seria primero el nombre del dominio
 y despues el nombre de la empresa con el que estamos trabajando primero se pone la extension del dominio
 y luego el nombre del dominio

 Por ejemplo: com.company

 Los paquetes permiten estructurar la clase o archivos de java

 Despues hacemos click derecho, new, y creamos un archivo nuevo en .java, lo que seria una clase,
 hay otras opciones, como Interface's o Enum's

 El nombre que ponemos tiene que empezar en mayuscula por convencion y no tiene que contener espacios
 y si tiene mas de una palabra deberiamos separar las palabras con una mayuscula

 Por ejemplo: HelloWorld
              HolaMundo

 Entonces se nos crea este archivo, y se nos genera un codigo inicial

 package com.company;  //Primera linea que implica que pertenece al paquete (en este caso a com.company)
                       //Porque es comun en un projecto tener mas de un paquete, se crean diferentes paquetes
                       //Para cada cosa

 public class HolaMundo {  //Esto lo que indica es que esto es una clase en .java, (t)odo en java van a ser clases
                           //public (indica visibilidad) class (por clase) y HolaMundo (El nombre que le pusimos)

        public static void main(String[] args) { //Esto es un metodo, que sirve punto de entrada a una app .java
                                                 //Tiene algunos modificadores
                                                 //public que se puede ejecutar fuera de la clase
                                                 //static que significa que pertenece a la clase HolaMundo
                                                 //       (O que no es necesario crear un objeto
                                                 //void que es el tipo de return, que no devuelve nada
                                                 //main que este es el metodo principal punto de entrar a la app
                                                 //     (Normalmente solo tendremos un main en to2 los projectos de
                                                 //      java, pero podemos crear mas clases con metodos main)
                                                 //String[] args que esto seria un array de argumentos que significa
                                                 //              (Que podria recibir datos por la entrada estandar
                                                 //               esta aplicacion)

               System.out.println("Hola mundo desde clase HolaMundo"); //Y desde el boton play lo ejecutamos
        }
  }
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde la clase HolaMundo");
    }
}
