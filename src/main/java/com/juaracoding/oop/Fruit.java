package com.juaracoding.oop;

import java.util.Arrays;

public class Fruit {

    // attribute (property)
    double grams;
    double calPerGram;

    // behavior
    double totalCalories(){
        return grams * calPerGram;
    }

}
