package curso.java.basico.Interfaces;

import curso.java.basico.Coche;
import curso.java.basico.CocheElectrico;
import curso.java.basico.Interfaces.CocheService;

public class CocheServiceClasscImp implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Creando coche carreras");
    }

}
