package com.epam.homework_add_3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number > 10 or < -10  ");
        int number = sc.nextInt();
        if ((number < 10) && (number > -10)) {
            System.out.println("Number " + number +" is not valued");
        }
        else {
            String numberToString = String.valueOf(number % 10);
            numberToString = numberToString + ((number % 100 - number % 10) / 10);
            System.out.println(" String = " + numberToString);

        }
    }
}
