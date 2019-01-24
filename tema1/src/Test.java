package com.sci.bv;

import java.util.Scanner;

public class Test {
    /**
     * check maximum from 3 numbers
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("introduceti primul numar:");
        int a = tastatura.nextInt();
        System.out.println("introduceti al doilea numar:");
        int b = tastatura.nextInt();
        System.out.println("introduceti al treilea numar:");
        int c = tastatura.nextInt();
        int max = 0;
        if (a >= b && a >= c ) {
            max = a;
            }
        if ( b >= a && b >= c) {
            max = b;
        }
        if (c >= a && c >= b) {
            max =  c;
        }
        System.out.println("maximul este: " + max);
    }
}