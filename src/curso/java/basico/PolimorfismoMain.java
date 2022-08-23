package curso.java.basico;

public class PolimorfismoMain {
    public static void main(String[] args) {

        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        // polimorfismo

        Coche coche4 = new CocheElectrico();

        if (coche4 instanceof Coche) {
            System.out.println("Coche");
        }

        if (coche4 instanceof  CocheElectrico) {
            System.out.println("Celectrico");
        }
    }
}
