package com.juaracoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MethodJava {

    public static void main(String[] args) {

        Random random = new Random();

        drawKotak(7);
        System.out.println();
        drawKotak(10);

        System.out.println(luasKotak(7));

        System.out.println(isLogin("admin","p4ssw0rd"));

        displayDetailProduct("Thinkplus T50",125000,352,100);

        double[] prices = {29.99,9.99,11.77};
        double totalPrice = totalPrice(prices);
        System.out.println(totalPrice);
        System.out.println(totalPricePlusTax(totalPrice));

        Double[] numbers = {29.99,9.99,11.77};
        Arrays.sort(numbers, Collections.reverseOrder());
        for(double number : numbers){
            System.out.println(number);
        }

        // compareTo
        String name = "Jakartc";
        System.out.println(name.compareTo("Jakarta"));

    }


    private static void drawKotak(int sisi){

        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static double luasKotak(double sisi){
        return sisi*sisi;
    }

    static boolean isLogin(String username, String password){
        return username.equals("admin") && username.equals("p4ssw0rd");
    }

    static void displayDetailProduct(String productName, double price, int stock, int amount){
        System.out.println(productName);
        System.out.println(price);
        System.out.println(stock);
        System.out.println(amount);
        // checkStock
        checkStock(stock,amount);
        // subTotal
        System.out.println(subTotal(price,amount));

    }

    private static void checkStock(int stock, int amount){
        // add condition
        if(stock > 0){
            if(amount <= stock) {
                System.out.println("Stock tersedia "+stock+" pcs");
                System.out.println("Button cart clickable");
            } else {
                System.out.println("Stock hanya tersedia "+stock+" pcs");
                System.out.println("Button cart not clickable");
            }
        } else {
            System.out.println("Stock kosong");
            System.out.println("Button cart not clickable");
        }

    }

    private static double subTotal(double price, int amount){
        return price * amount;
    }

    // totalPrice
    private static double totalPrice(double[] prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    private static double totalPricePlusTax(double totalPrice){
        return totalPrice+(totalPrice*11/100);
    }

}
