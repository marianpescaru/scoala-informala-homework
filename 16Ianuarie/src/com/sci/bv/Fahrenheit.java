package com.sci.bv;

import java.util.Scanner;

public class Fahrenheit {
    /**
     * this is exercise 2, homework 16.01
     * Fahrenheit to Celsius conversion
     * using temperatureConversion() method
     *
     * @author Marian Pescaru
     */

    static int temperatureConversion(int a){
        return (a - 32)*5/9;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter body temperature (F):");
        int tempf = keyboard.nextInt();
        int tempc = Fahrenheit.temperatureConversion(tempf);
        System.out.println("Your body temperature in Celsius degrees is: " + tempc);
        if (tempc >= 37) {
            System.out.println("You are ill!");
        }
        if (tempc < 30) {
            System.out.println("You're most likely dead!");
        }
    }
}
