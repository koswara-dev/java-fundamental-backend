package com.juaracoding;

import java.util.Scanner;

public class ArrayJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productName = {"Keyboard","Mouse","Monitor"};

        double[] price = {100000,200000,1500000};

        int[] numbers = {91,92,93,94,95};
        System.out.println(numbers[2]);

        int totalData = 5;
        int[] num = new int[totalData];
        num[0] = 91;
        num[1] = 92;
        num[2] = 93;
        num[3] = 94;
        num[4] = 95;
        num[3] = 96;
        System.out.println(num[3]);

        System.out.println(num.length);

        //foreach
        for(int number : numbers){
            System.out.println(number);
        }

        for (int i = 0; i < productName.length; i++) {
            System.out.println(productName[i]);
            System.out.println(price[i]);
        }

        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers[0][3]);
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        System.out.println(myNumbers[1].length);
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) { // j = 3 < 3
                System.out.println(myNumbers[i][j]); // [1][2]
            }
        }

        int rows = 2;
        int colomn = 4;
        int[][] myNums = new int[rows][colomn];

        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Bali", "Makassar"};

        System.out.println("Cari nama kota = ");
        String search = scanner.next();
        boolean isFound = false;
        int index = 0;

        for (int i = 0; i < cities.length; i++) {

            if(search.equalsIgnoreCase(cities[i])){
                isFound = true;
                index = i;
                break;
            }

        }

        if(isFound){
            System.out.println("Data ditemukan pada index ke-"+index);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        String city = "Jakarta";
        System.out.println(city.length());


    }

}
