package org.example.calculator;

import org.example.calculator2.Calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write first number to calculate: ");
            int firstNumber = sc.nextInt();

            if (firstNumber < 0) {
                System.out.println("Please enter a positive number");
                System.out.println("Write first number to calculate: ");
                firstNumber = sc.nextInt();
            }

            System.out.println("Write second number to calculate: ");
            int secondNumber = sc.nextInt();

            if (secondNumber < 0) {
                System.out.println("Please enter a positive number");
                System.out.println("Write second number to calculate: ");
                secondNumber = sc.nextInt();
            }

            System.out.println("Write operator to calculate: ");
            String operator = sc.next();


            Calculator2 doCalculate = new Calculator2();
            doCalculate.calculate(firstNumber, secondNumber, operator);
            doCalculate.fullGetter();
            doCalculate.printResult();






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
