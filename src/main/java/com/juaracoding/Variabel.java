package com.juaracoding;

import java.awt.Rectangle;

public class Variabel {

    public static void main(String[] args) {

        int productId = 1;
        String productName;
        productName = "Mouse Wireless";

        int stock = 32_000;
        long id = 3000000000l;
        float price = 11000.56f;
        double saldo = 4000000000.99;

        System.out.println(price);
        System.out.printf("%.1f --- %.1f --- %d --- %s\n",price,saldo,stock,productName);
        System.out.println(saldo);

        char size = 'M';

        String pathImage = "C:\\Users\\Lenovo\\OneDrive\\Gambar\\mouse_wireless.png";
        System.out.println(pathImage);

        boolean isSoldOut = true;

        // buatkan deklarasi variabel profile user


        // automatic casting
        short data1 = 10000;
        double dataDouble = data1;

        System.out.println(data1);
        System.out.println(dataDouble);

        char data2 = 'z';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting
        long data3 = 9223372036854775000l;
        int dataInt = (int) data3;
        System.out.println(dataInt);

        int age = 25;
        int duplicateAge = age;
        duplicateAge = 40;
        System.out.println(age);
        System.out.println(duplicateAge);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        System.out.println(kotak);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());

    }

}
