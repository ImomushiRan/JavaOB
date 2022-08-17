package curso.java.basico;

public class VariablesYTiposDeDatos {
    public static void main(String[] args) {
        // tipo identificador operador igual o de asignacion y el valor ;
        // tipo ident;
        // ident = 30;

        // enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; // 8 byte
        //Los mas utilizados son int y long por su capacidad

        // punto flotante
        float numberf = 1.1f; // menos tamaño
        double numberd = 1.11d; // mas tamaño por defecto se usa el double

        // caracter
        char caracter1 = 'a';

        // booleanos
        boolean verd = true;
        boolean fals = false; //Palabras reservadas

        // cadenas de texto
        String nombre = "hola"; //(requiere usar una clase)

        // tipos envoltorio
        // los tipos primitivos no pueden ser nulos o sea todos menos String pq no es prim
        // ej (int num = null; da error) null que no tiene valor definido

        Integer num = null; //Para eso tenemos los tipos envoltorio que empiezan por mayuscula, o sea que son clases)
        Long num2= 2L ; //Envuelven a los tipos primitivos y nos permiten emplear nulos
        //Util cuando estamos trabajando con datos en una base de datos y una columna es un valor tipo numerico
        //Pero no tenemos ese dato es nulo, o porque el usuario no lo ha rellenado o ese dato todavia no se a creado
    }
}
