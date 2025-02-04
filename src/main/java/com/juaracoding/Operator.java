package com.juaracoding;

public class Operator {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;
        int sum = num1 % num2; // modulus
        System.out.println(sum);

        int x = 2;
        int num3 = 10 * x--; // suffix
        System.out.println(num3);

        int y = 2;
        int num4 = 10 * --y; // prefix
        System.out.println(num4);

        int num5 = (10+2)*3;
        System.out.println(num5);

        num5 += 4; // num5 = num5 + 4
        System.out.println(num5);

        boolean isResult = 10<10;
        System.out.println(isResult);

        int num6 = 10 & 12;
        System.out.println(num6);

        String decimal = Integer.toBinaryString(num6);
        System.out.println(decimal);

        System.out.println(num6<<1); // left shift

        boolean multiCondition = (true && false) || (true || false);
        System.out.println(multiCondition);

        String text1 = "Jakarta";
        String text2 = "Jakarta";
        System.out.println(text1.equals(text2));
        System.out.println(text1.toUpperCase());

    }

}
