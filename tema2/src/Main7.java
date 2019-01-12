package com.sci.bv;

import java.util.Scanner;

public class Main7 {
    /**
     * this is exercise 7, homework 14.01
     * display area of a square
     *
     * @author Marian Pescaru
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti dimensiunea:");
        int x = keyboard.nextInt();
        if (x > 0) {
            int square = x * x;
            System.out.println("aria patratului cu latura " + x + " este: " + square);
        } else {
            System.out.println("latura patratului trebuie sa fie mai mare ca 0!");
        }
    }
}
