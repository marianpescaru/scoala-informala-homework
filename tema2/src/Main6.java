package com.sci.bv;

import java.util.Scanner;

public class Main6 {
    /**
     * this is exercise 6, homework 14.01
     * display area and perimeter of a rectangle
     *
     * @author Marian Pescaru
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduceti prima cota:");
        int a = keyboard.nextInt();
        System.out.println("introduceti a doua cota:");
        int b = keyboard.nextInt();
        int area = 0;
        int perimeter = 0;
        if (a <=0 || b <=0) {
            System.out.println("introduceti valori pozitive!");
        }
        if (a == b) {
            System.out.println("acesta este un patrat ;), totusi...: ");
        }
        if (a > 0 && b > 0) {
            area = a * b;
            perimeter = 2 * a + 2 * b;
            System.out.println("aria este: " + area);
            System.out.println("perimetrul este: " + perimeter);
        }
        }

}
