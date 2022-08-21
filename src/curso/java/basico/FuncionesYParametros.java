package curso.java.basico;

public class FuncionesYParametros {
    public static void main(String[] args) {

        /*
        Funciones=
        agrupaciones de sentencias que se pueden reutilizar desde nuestra app
        */

        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

        holaMundo();

        /*
        Simulando invocamos funcion holaMundo
        y el ide nos da la opcion de crear el metodo, podemos hacerlo a mano
        "public static void holaMundo () {{"
                            (identificador)
                            si tiene otro nombre cuando la llamamos no lo detecta
                       (tipo de retorno) (void=sinretorno) (string, int, bool)
                (pertenece a la clase) (que pertenece a funciones y no hay que crear un obj)
         (ambito) (si puede ser invocada fuera de la clase o no)
         */

        holaMundo1("Alan");

        String hola = holaMundo1("joji");
        System.out.println(hola);

        // se le da un parametro y puede pedir parametros las funciones
        // y se puede pedir con parametros diferentes

        // y el tipo de retorno es para cuando queremos que devuelva algo

        /*
        Private= solo es accesible de esta clase
        public = Se puede acceder en to2 el programa
        Protected = Solo las clases hijas o en el mismo paquete puedan acceder a la fn
          = igual al protected


         */

        /*
        Sobrecarga de funciones

        byeMundo()
        private static void byeMundo() {}
        public static void byeMundo() {}
         */

    }


    protected static String holaMundo1(String name) {
        System.out.println("hola " + name);
        return name;
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");

    }



 }
