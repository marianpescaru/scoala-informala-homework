package com.sci.bv;

import java.util.Scanner;

public class Maximum {
    /**
     * this is exercise 1, homework 16.01
     * display the maximum of 3 numbers
     * using getMax() method
     *
     * @author Marian Pescaru
     */

        static int getMax(int a, int b) {
        if(a >=b){
            return a;
        } else{
            return b;
            }
        }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int a = keyboard.nextInt();
        System.out.println("introduceti al doilea numar:");
        int b = keyboard.nextInt();
        System.out.println("introduceti al treilea numar:");
        int c = keyboard.nextInt();
        int x = Maximum.getMax(a, b);
        if (x >= c) {
            System.out.println("maximul este: " + x);
        } else {
            System.out.println("maximul este: " + c);
        }
    }
}
