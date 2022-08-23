package curso.java.basico;

public class CocheElectrico extends Coche {
        String motorElectrico;

        public CocheElectrico () {
        }

        public CocheElectrico (String motorElectrico) {
            this.motorElectrico = motorElectrico;
        }

        public CocheElectrico (String color, String modelo, String fabricante, double largo, double ancho, String motorElectrico) {
            super (color, modelo, fabricante, largo, ancho);
            this.motorElectrico = motorElectrico;
        }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
