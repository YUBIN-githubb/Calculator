package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number to calculate: ");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number to calculate: ");
        int secondNumber = sc.nextInt();
        System.out.println("Write operator to calculate: ");
        String operator = sc.next();

        int result = 0;
        if(operator.equals("+")){
            result = firstNumber + secondNumber;
        }

        System.out.println(result);




    }
}
