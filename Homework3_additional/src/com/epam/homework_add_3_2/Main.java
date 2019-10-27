package com.epam.homework_add_3_2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 0 to 8 ");
        int number = sc.nextInt();
        if ((number <= 8) && (number > 0)) {
            pyramid(number);
        }
        else {
            System.out.println("Wrong number ");
        }
    }

    public static void pyramid(int height) {

        for (int i = 1; i <= (height + 1); i++) {
           String numString = "";
            for (int k = (height + 1); k > i; k--) {
                numString = numString + " ";
            }
           for (int j = 1 ; j <= i; j++) {
               numString = numString + String.valueOf(j);
           }
           for (int j = (i - 1); j >= 1; j-- ) {
               numString = numString + String.valueOf(j);
           }
           System.out.println(numString);
        }
    }
}
