package com.java.ejercicios.tema4;

public class SmartWatch extends SmartDevice {

    boolean canCheckWeather;
    boolean canCheckHealth;
    boolean canListenMusic;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, int modelage, double batteryduration, boolean canCheckWeather, boolean canCheckHealth, boolean canListenMusic) {
        super(brand, model, modelage, batteryduration);
        this.canCheckWeather = canCheckWeather;
        this.canCheckHealth = canCheckHealth;
        this.canListenMusic = canListenMusic;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "canCheckWeather=" + canCheckWeather +
                ", canCheckHealth=" + canCheckHealth +
                ", canListenMusic=" + canListenMusic +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelage=" + modelage +
                ", batteryduration=" + batteryduration +
                '}';
    }
}
