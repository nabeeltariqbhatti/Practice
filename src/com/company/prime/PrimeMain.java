package com.company.prime;

import java.util.Scanner;
import java.lang.System;
/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/5/2022
 * @Time at 9:34 PM
 */
//check if a number is a prime number 
public class PrimeMain {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s", "enter the number");
        number = scanner.nextInt();
        int c = 2;

        while (c*c<=number){
            if(number%c==0){
                System.out.println(" not prime");
                System.exit(-1);
            }
            c++;

        }
        System.out.println("prime");
    }



}
