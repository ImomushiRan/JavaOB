package com.java.ejercicios.tema4;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();
        SmartDevice smartdevice1 = new SmartDevice("nokia","1100",2000,6.59);

        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone1 = new SmartPhone("Motorola","E5",2018,35.59,16,"usb",true);

        SmartWatch smartWatch = new SmartWatch();
        SmartWatch smartWatch1 = new SmartWatch("Iphone","X",2020,150,true,true,true);


        System.out.println(smartDevice.toString());
        System.out.println(smartdevice1.toString());
        System.out.println(smartPhone.toString());
        System.out.println(smartPhone1.toString());
        System.out.println(smartWatch.toString());
        System.out.println(smartWatch1.toString());
    }
}
