package com.juaracoding;

public class WrapperClassJava {

    public static void main(String[] args) {

        Integer number = null;

        Character character = 'a';
        char value = character.charValue();
        System.out.println(value);

        String salary = "8000";
        double valSalary = Double.parseDouble(salary);
        double pph21 = valSalary*5/100;
        System.out.println(valSalary-pph21);

        formAddEmployee();

        char satu = '1';
        System.out.println(Character.isDigit(satu));

        char a = 'a';
        System.out.println(Character.isDigit(a));

        String price1 = "$29.99"; // replace "$",""
        String price2 = "$9.99";
        System.out.println(price1+price2);

        String year = "2025 ";
        String prodiId = "007"; // TI
        String regId = "1001";
        String NIM = ""; // tahun,kodeProdi,nomorUrut

        System.out.println(year.trim().equals("2025"));

    }

    // lengkapi method formAddEmployee
    static void formAddEmployee(){

        System.out.println("Firstname: ");
        System.out.println("Lastname: ");
        System.out.println("Email: ");
        System.out.println("Age: ");
        System.out.println("Salary: ");
        System.out.println("Salary-pph21: ");
        System.out.println("Department: ");

    }

}
