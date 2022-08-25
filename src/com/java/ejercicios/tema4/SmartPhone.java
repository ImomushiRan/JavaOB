package com.java.ejercicios.tema4;

public class SmartPhone extends SmartDevice{

    int storage;
    String chargertype;
    boolean protectiveScreen;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, int modelage, double batteryduration, int storage, String chargertype, boolean protectiveScreen) {
        super(brand, model, modelage, batteryduration);
        this.storage = storage;
        this.chargertype = chargertype;
        this.protectiveScreen = protectiveScreen;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "storage=" + storage +
                ", chargertype='" + chargertype + '\'' +
                ", protectiveScreen=" + protectiveScreen +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelage=" + modelage +
                ", batteryduration=" + batteryduration +
                '}';
    }
}
