package org.example.calculator2;

import java.util.*;

public class Calculator2 {

    //field
    //use static keyword to share resultArray between instance
    static private ArrayList<Integer> resultArray = new ArrayList<Integer>();
    int result = 0;

    //method
    public void calculate(int firstNumber, int secondNumber, String operator) {
        Scanner sc = new Scanner(System.in);
        if(operator.equals("+")){
            this.result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            this.result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            this.result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            if(secondNumber == 0){
                System.out.println("Division by zero is impossible");
                System.out.println("first number is: " + firstNumber);
                System.out.println("rewrite the second number: ");
                secondNumber = sc.nextInt();
            }
            this.result = firstNumber / secondNumber;

        }

        resultArray.add(this.result);

    };

    public int getter(int index) {
        return resultArray.get(index);
    };

    public void setter(int index, int value) {
        resultArray.set(index, value);
    };

    public void printResult() {
        System.out.println("result is " + resultArray.get(resultArray.size()-1));
    }

    public void removeResult() {
        resultArray.remove(resultArray.remove(0));
    }

    public void fullGetter() {
        System.out.println(resultArray.toString());
    };


    public static void main(String[] args) {



    }
}
