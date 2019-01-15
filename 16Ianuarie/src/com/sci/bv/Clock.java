package com.sci.bv;

import java.util.Scanner;

public class Clock {
    /**
     * this is exercise 3, homework 16.01
     * Shows the time based on user 2 inputs
     * hour hh and minutes mm
     *
     * @author Marian Pescaru
     */

    static int hours (int a) {
        int eroare = 99;
        if (a >= 0 && a <= 12) {
            return a;
        } else {
            System.out.println("Eroare! Ora inexistenta");
            return eroare;
        }
    }
    static int minutes (int b){
            int eroare = 99;
            if (b >= 0 && b <= 59){
                return b;
            } else {
                System.out.println("Eroare! Minute inexistente");
                return eroare;
            }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What time is it? (introduce hour, press 'enter' and minutes)");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int hour = Clock.hours(a);
        int min = Clock.minutes(b);
        System.out.println("The time is " + hour + ":" + min + " now");
    }
}

