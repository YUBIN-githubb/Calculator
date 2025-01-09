package org.example.calculator;

import org.example.calculator2.Calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);

            //숫자 입력
            int firstNumber;
            System.out.println("계산할 첫번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
            while (true) {
                try {
                    firstNumber = sc.nextInt();
                    if (firstNumber < 0) {
                        System.out.println("0을 포함한 양수를 입력하세요.");
                        System.out.println("계산할 첫번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
                        sc.nextLine();
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("정수를 입력하세요.");
                    System.out.println("계산할 첫번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
                    sc.nextLine();
                }
            }

            int secondNumber;
            System.out.println("계산할 두번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
            while (true) {
                try {
                    secondNumber = sc.nextInt();
                    if (secondNumber < 0) {
                        System.out.println("0을 포함한 양수를 입력하세요.");
                        System.out.println("계산할 두번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
                        sc.nextLine();
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("정수를 입력하세요.");
                    System.out.println("계산할 두번째 숫자을 입력하세요.(0을 포함한 양의 정수): ");
                    sc.nextLine();
                }
            }

            //연산자 입력
            System.out.println("계산할 연산자를 입력하세요.: ");
            char operator;
            while (true) {
                try {
                    String inputOperator = sc.next();
                    if (inputOperator.isEmpty()) {
                        System.out.println("계산할 연산자를 입력하세요.: ");
                        sc.nextLine();
                        continue;
                    }
                    operator = inputOperator.charAt(0);
                    if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                        System.out.println("입력할 수 있는 연산자는 오직 +,-,*,/ 입니다.");
                        System.out.println("계산할 연산자를 입력하세요.: ");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                catch (Exception e) {
                    System.out.println("유효하지 않은 입력입니다. 입력할 수 있는 연산자는 오직 +,-,*,/ 입니다.");
                    System.out.println("계산할 연산자를 입력하세요.: ");
                }
            }

            //계산 수행
            Calculator2 doCalculate = new Calculator2();
            doCalculate.calculate(firstNumber, secondNumber, operator);
            doCalculate.printResult();

            //계산 결과 기록
            System.out.println("현재까지 기록된 계산결과입니다.");
            doCalculate.fullGetter();

            //계산 결과 삭제
            System.out.println("계산결과를 삭제하고 싶다면 remove를 입력하세요.\n계산결과를 수정하고 싶다면 edit을 입력하세요.\n그렇지 않다면 아무 키나 입력하세요: " );
            String removeAnswer = sc.next();
            if(removeAnswer.equals("remove")) {
                while(true) {
                    System.out.println("현재까지 기록된 계산결과입니다.");
                    doCalculate.fullGetter();
                    if(doCalculate.getter().isEmpty()) {
                        System.out.println("기록된 계산결과가 없습니다. 삭제를 종료합니다.");
                        break;
                    }
                    System.out.println("가장 첫번째 결과부터 삭제됩니다.\n삭제를 원하면 1을 입력하세요. 삭제를 종료하고 싶다면 0을 입력하세요.: ");
                    int removeInt = sc.nextInt();
                    if(removeInt == 1) {
                        doCalculate.removeResult();
                    } else if (removeInt == 0) {
                        break;
                    }
                }

            //계산결과 수정
            } else if (removeAnswer.equals("edit")) {
                while(true) {
                    System.out.println("현재까지 기록된 계산결과입니다.");
                    doCalculate.fullGetter();
                    System.out.println("수정하고 싶은 결과의 인덱스를 입력하세요.(0부터 시작): ");
                    int editIndex = sc.nextInt();
                    System.out.println("어떤 값으로 수정하시겠습니까? 값을 입력하세요.: ");
                    int editValue = sc.nextInt();
                    doCalculate.setter(editIndex, editValue);
                    System.out.println("수정된 계산 결과입니다.");
                    doCalculate.fullGetter();
                    System.out.println("계속 수정을 원할 경우 1을 입력하세요. 수정을 종료하고 싶다면 0을 입력하세요.: ");
                    int editInt = sc.nextInt();
                    if(editInt == 1) {
                        continue;
                    } else if (editInt == 0) {
                        break;
                    }
                }
            }

            //종료 여부 결정
            System.out.println("계산을 이어서 수행하고 싶은 경우 continue 입력, 종료하고 싶은 경우 exit을 입력하세요.: ");
            String answer = sc.next();
            if(answer.equals("exit")){
                break;
            } else if (answer.equals("continue")) {
                continue;
            }
        }
    }
}
