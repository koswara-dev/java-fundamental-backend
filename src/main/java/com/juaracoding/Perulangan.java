package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // 5 < 5 false
            System.out.println(i);
        }

        System.out.println("Next Statement");

        for (int i = 4; i >= 0; i--) { // -1 >= 0 false
            System.out.println(i);
        }

        System.out.println("Next Statement");

        // 13579
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            i++;
        }
        System.out.println();
        // pola kotak
        int sisi = 7;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // segitiga siku
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j <= i; j++) { // 0 <= 2
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = sisi; i > 0; i--) {
            for (int j = i; j > 0; j--) { // 0 > 0
                System.out.print("*");
            }
            System.out.println();
        }

        double[] price = {29.99,9.99,11.77};
        double sum = 0;
        System.out.println(price.length);
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
            sum += price[i];
        }
        System.out.println("Total Harga = "+sum);

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        while(x < 0) {
            System.out.print("x="+x);
            x++;
        }

        int y = 0;
        do {
            System.out.print("y="+y);
            y++;
        }while (y < 0);

        while (true){
            System.out.println("Input angka = ");
            int angka = scanner.nextInt();
            if(angka == 0){
                break;
            }
            System.out.println("Input angka 0 untuk exit dari console");
        }

        System.out.println("Pilih Menu CRUD:");
        int selectMenu = scanner.nextInt();
        switch (selectMenu){



        }

    }

}
