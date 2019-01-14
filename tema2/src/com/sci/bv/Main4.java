package com.sci.bv;

import java.util.Scanner;

public class Main4 {
    /**
     * this is exercise 4, homework 14.01
     * check if a number is a palindrome
     *
     * @author Marian Pescaru
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("introduceti un sir de numere:");
        String a = keyboard.next();
        int i, j = 0;
        boolean flag = true;
        for (i = 0, j=a.length()-1; j > 1; i++, j--){
            if (a.charAt(i) != a.charAt(j)) {
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("number is a palindrome");
            } else {
            System.out.println("number is not a palindrome");
        }
    }
}
