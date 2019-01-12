package com.sci.bv;

import java.util.Scanner;

public class Main8 {
    /**
     * this is exercise 8, homework 14.01
     * display maximum of 3 numbers
     *
     * @author Marian Pescaru
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int a = keyboard.nextInt();
        System.out.println("introduceti al doilea numar:");
        int b = keyboard.nextInt();
        System.out.println("introduceti al treilea numar:");
        int c = keyboard.nextInt();
        int maxim = 0;
        if (a >= b && a >= c) {
            maxim = a;
        } else if (b >= a && b >= c) {
            maxim = b;
        } else {
            maxim = c;
        }
        System.out.println("maximul dintre cele 3 numere este: " + maxim);
    }
}
