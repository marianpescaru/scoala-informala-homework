package com.sci.bv;

public class Main1 {
    /**
     * this is exercise 1, homework 14.01
     * calculate the sum 1 to 100
     *
     * @author Marian Pescaru
     */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("suma primelor 100 de numere este: " + sum);
    }
}
