package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //build a scanner
        Scanner fetch = new Scanner (System.in);

        //fetch number input for calculation
        System.out.println("Enter the first number: ");
        float firstNumber = fetch.nextFloat();

        System.out.println("Enter the second number: ");
        float secondNumber = fetch.nextFloat();

        //clearing buffer
        fetch.nextLine();

        //fetch operator input
        System.out.println("Please select an option:\n A for Addition\n S for Subtraction\n M for Multiplication\n D for Division");
        String operator = fetch.nextLine();

        //calculating
        float result=0;
        if (operator.equalsIgnoreCase("A")) {
            result = firstNumber + secondNumber;
        } else if (operator.equalsIgnoreCase("S")) {
            result = firstNumber - secondNumber;
        }else if  (operator.equalsIgnoreCase("M")) {
            result = firstNumber * secondNumber;
        }else if (operator.equalsIgnoreCase("D")){
            result  = firstNumber / secondNumber;
        } else
            System.out.println("Invalid input");

        //display result
        System.out.println("The result is: " + result);
    }
}
