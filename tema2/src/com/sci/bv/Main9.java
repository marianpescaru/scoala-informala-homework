package com.sci.bv;

import java.util.Scanner;

public class Main9 {
    /**
     * this is exercise 9, homework 14.01
     * display the numbers between 2 numbers
     *
     * @author Marian Pescaru
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int a = keyboard.nextInt();
        System.out.println("introduceti al doilea numar:");
        int b = keyboard.nextInt();
        if (a > b) {
            do {
                System.out.print(b + ", ");
                b = b + 1;
            } while (b <= a);
        } else if (b > a) {
            do {
                System.out.print(a + ", ");
                a = a + 1;
            } while (a <= b);
        } else {
            System.out.println("Cele 2 numere sunt egale!");
        }
    }
}


