package com.juaracoding;

import java.util.Random;

public class MethodJava {

    public static void main(String[] args) {

        Random random = new Random();

        drawKotak(7);
        System.out.println();
        drawKotak(10);

        System.out.println(luasKotak(7));

    }


    private static void drawKotak(int sisi){

        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static double luasKotak(double sisi){
        return sisi*sisi;
    }


}
