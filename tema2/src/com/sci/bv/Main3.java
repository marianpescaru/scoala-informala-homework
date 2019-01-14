package com.sci.bv;

import java.util.Scanner;

public class Main3 {
    /**
     * this is exercise 4, homework 14.01
     * check if a number is a palindrome
     *
     * @author Marian Pescaru
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti un sir de numere:");
        int a = keyboard.nextInt();
        int x = a % 10;
        int max = a % 10;
        do {
            a = a / 10;
            if (max > x) {
                max = max;
            } else {
                max = x;
            }
        } while (a / 10 > 1);
        System.out.println("cifra maxima este :" + max);
    }
}
