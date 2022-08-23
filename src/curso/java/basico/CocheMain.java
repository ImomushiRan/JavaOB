package curso.java.basico;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche();

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Rojo";
        cocheElectrico.modelo = "civic";
        cocheElectrico.fabricante = "honda";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico1 = new CocheElectrico("Motorsete","Alfaromeo","alfaromio",124.123,11.11,"motorsote");

        System.out.println(cocheElectrico1);

    }
}
