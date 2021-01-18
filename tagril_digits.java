package com.company;

import java.util.Scanner;

public class Main
{
    public static int howManyDigits(int number) {
        // 55 5 0
        // 1 counter = 0
        // 2 number divide 10
        // 3 counter++; 1 2
        // 5 did we got zero? yes , exit. no -> goto 2
        // number of digits = counter
        int counter = 0;
        do {
            number = number / 10;
            counter++;
        } while (number > 0);
        return counter;
    }

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println(howManyDigits(37782));
    }

}
