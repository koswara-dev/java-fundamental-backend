package com.juaracoding;

public class Percabangan {

    public static void main(String[] args) {

        if(false){
            System.out.println("Statement");
        } else {
            System.out.println("Else Statement");
        }

        System.out.println("Next Statement");

        // angka 5 adalah bilangan ganjil
        // angka 6 adalah bilangan genap
        int angka = 5;

        boolean isPasswordShow = false;
        String typeInput = isPasswordShow ? "text" : "password";
        System.out.println(typeInput);

        //
        String nomorHP = "";
        String email = "";
        boolean isRegistered = true;
        boolean isOTPReceived = true;
        String otp = "";

        if(nomorHP.equals("") || email.equals("")){

            if(isRegistered) {

                if(isOTPReceived){

                    if(otp.equals("")){

                    }

                }

            }

        } else {

            System.out.println("Nomor HP atau Email belum terdaftar");

        }


    }

}
