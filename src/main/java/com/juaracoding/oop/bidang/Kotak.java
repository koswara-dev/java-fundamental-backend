package com.juaracoding.oop.bidang;

public class Kotak {

    // sisi
    private double sisi;

    // constructor
    public Kotak(double sisi){
        this.sisi = sisi;
    }

    // draw, luas
    public void drawKotak(){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double luasKotak(){
        return sisi*sisi;
    }

}
