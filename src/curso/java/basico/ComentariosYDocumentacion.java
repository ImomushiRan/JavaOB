package curso.java.basico;

public class ComentariosYDocumentacion {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {

        //Hay dos formas de escribir comentarios
        // para lineas de codigo
        /* */ /*
        Para parrafos de codigo enteros

         Que se usan para escribir un indice de tareas o pasos que tenemos que hacer
         si estamos programando un algoritmo podemos escribir aqui las instrucciones exactas

         Por ejemplo: 1. Abrir fichero
                      2. Leer fichero
                      3. Procesar un fichero
                      4. Cerrar fichero

         Entonces estos comentarios lo que harian seria ayudarnos en un nivel interno a ver que hace un codigo
         Normalmente cuando el codigo es muy sencillo no lo ponemos pero cuando el codigo es complejo es interesante
         poder agregar ciertos comentarios sobre el codigo

         Por ejemplo: si tenemos una instruccion de codigo

                    //Imprimir texto
                    System.out.println("HolaMundo"); //Imprimir texto (o lo podemos poner al lado)

         Otro estilo de comentarios que va ya mas orientado al mantenimiento de nuestro codigo es aquel que forma
         parte de la documentacion que es cuando usamos dos asteriscos a la hora de crearlo /** y esto automaticamente
         va a detectar si tenemos parametros y agregarlos como en el ejemplo el parametro que tenemos es args
         y agregara una serie de anotaciones con arroba que lo que van a indicar es en este caso los argumentos
         podemos poner:

                     Funcion principal punto de entrada a la aplicacion (estando en /main, o clase principal
                                                                         estando en main class)
         Por ejemplo:@param args (Argumentos a recibir)
                     @see (para indicar que se miren otras clases que ya tengamos programadas)
                     @since 1.0 (Para indicar que esto es desde la version 1.0)
                     @apiNote
                     @deprecated
                     @exception
                     @hidden
                     @implNote
                     @implSpec
                     @serialData
                     @throws
                     @author (el nombre que corresponda)

         Esto con herramientas podemos generar un JavaDoc o documentacion de la aplicacion en la cual
         se leen estos comentarios que estamos poniendo sobre metodos o clases y se generaria un sitio web
         a partir de los mismos lo cual ayudaria a detectar cuantas clases hay que hace cada una

         No hay que llenarlo de comentarios, porque dificulta la lectura, la idea es usar que los nombres de
         las variables sean descriptivos asi no se necesitan comentarios para explicar que hacen
         y habria solo comentarios o documentacion para lo que si o si se necesite y se pueda entender al codigo
         o viendo solo desde la documentacion
         */
    }
}
