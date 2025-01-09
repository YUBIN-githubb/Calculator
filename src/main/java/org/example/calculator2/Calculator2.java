package org.example.calculator2;

import java.util.*;

public class Calculator2 {

    //객체 간의 계산결과를 공유하기 위해서 static 키워드 사용
    static private List<Integer> resultArray = new ArrayList<Integer>();
    private int result = 0;

    //계산 메서드
    public void calculate(int firstNumber, int secondNumber, char operator) {
        Scanner sc = new Scanner(System.in);
        if(operator == '+'){
            this.result = firstNumber + secondNumber;
        } else if (operator == '-') {
            this.result = firstNumber - secondNumber;
        } else if (operator == '*') {
            this.result = firstNumber * secondNumber;
        } else if (operator == '/') {
            if(secondNumber == 0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                System.out.println("첫번째 숫자: " + firstNumber);
                System.out.println("두번째 숫자를 다시 입력하세요: ");
                secondNumber = sc.nextInt();
            }
            this.result = firstNumber / secondNumber;
        }
        resultArray.add(this.result);
    };
    public List<Integer> getter() {
        return resultArray;
    }

    public void setter(int index, int value) {
        resultArray.set(index, value);
    };

    public void printResult() {
        System.out.println("계산 결과는 " + resultArray.get(resultArray.size()-1) + "입니다.");
    }

    public void removeResult() {
        resultArray.remove(0);
    }

    public void fullGetter() {
        System.out.println(resultArray.toString());
    };

    public static void main(String[] args) {

    }
}
