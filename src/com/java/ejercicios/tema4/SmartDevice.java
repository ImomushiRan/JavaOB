package com.java.ejercicios.tema4;

public class SmartDevice {

    String brand;
    String model;
    int modelage;
    double batteryduration;


    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, int modelage, double batteryduration) {
        this.brand = brand;
        this.model = model;
        this.modelage = modelage;
        this.batteryduration = batteryduration;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelage=" + modelage +
                ", batteryduration=" + batteryduration +
                '}';
    }
}
