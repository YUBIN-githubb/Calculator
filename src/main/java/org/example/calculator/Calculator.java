package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true) {
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
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                if(secondNumber == 0){
                    System.out.println("Division by zero is impossible");
                    System.out.println("first number is: " + firstNumber);
                    System.out.println("rewrite the second number: ");
                    secondNumber = sc.nextInt();
                }
                result = firstNumber / secondNumber;
            }

            System.out.println("result is " + result);

            System.out.println("If you wanna continue, Write continue. Unless write exit. Write answer: ");
            String answer = sc.next();
            if(answer.equals("exit")){
                break;
            } else if (answer.equals("continue")) {
                continue;
            }

        }


    }
}
