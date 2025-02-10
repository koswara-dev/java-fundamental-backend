package com.juaracoding.oop;

import com.juaracoding.oop.bidang.Kotak;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.grams = 2000;
        apple.calPerGram = 52.0/100.0;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit avocado = new Fruit();
        avocado.grams = 2000;
        avocado.calPerGram = 160.0/100.0;
        System.out.println(avocado.totalCalories());
        System.out.println(avocado);

        Scanner scanner = new Scanner(System.in);

        Kotak kotakSatu = new Kotak(20);
        kotakSatu.drawKotak();


    }

}
