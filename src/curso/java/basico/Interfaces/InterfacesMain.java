package curso.java.basico.Interfaces;

import curso.java.basico.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service = new CocheServiceClasscImp();

        Coche coche = service.crearCocheDemo();

        //Coche coche2 = service2.crearCocheDemo();


    }
}
