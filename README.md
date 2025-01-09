# 계산기 프로젝트

## 소개
이 프로젝트는 사용자로부터 두 개의 숫자와 연산자를 입력받아 계산을 수행하고, 결과를 기록하고 관리할 수 있는 콘솔 기반의 계산기 애플리케이션입니다. 사용자는 계산 결과를 삭제하거나 수정할 수 있으며, 모든 계산 기록을 확인할 수 있습니다.

## 주요 기능
- **덧셈, 뺄셈, 곱셈, 나눗셈 수행**:
  사용자 입력에 따라 두 정수의 기본 연산을 수행합니다.
- **예외 처리**:
  잘못된 입력(예: 정수가 아닌 값 입력, 잘못된 연산자 입력, 나눗셈에서 0으로 나누기 등)에 대해 사용자에게 올바른 값을 다시 입력하도록 안내합니다.
- **계산 기록 관리**:
    - 모든 계산 결과를 기록하고 출력합니다.
    - 기록된 계산 결과를 삭제하거나 수정할 수 있습니다.

## 클래스 구조

### App 클래스
- 사용자 입력을 처리하고, `Calculator2` 클래스의 메서드를 호출하여 계산을 수행합니다.
- 주요 역할:
    - 첫 번째와 두 번째 숫자 입력 처리
    - 연산자 입력 처리
    - 계산 수행 및 결과 출력
    - 계산 기록 삭제 및 수정 기능 제공
    - 프로그램 종료 또는 계속 실행 여부 결정

### Calculator2 클래스
- 계산 로직과 계산 결과 기록을 관리합니다.
- 주요 메서드:
    - `calculate(int firstNumber, int secondNumber, char operator)`:
        - 덧셈, 뺄셈, 곱셈, 나눗셈 연산 수행
        - 나눗셈에서 분모가 0인 경우 예외 처리
    - `getter()`:
        - 계산 기록(ArrayList)을 반환
    - `setter(int index, int value)`:
        - 특정 인덱스의 계산 결과를 수정
    - `printResult()`:
        - 마지막 계산 결과 출력
    - `removeResult()`:
        - 계산 기록에서 첫 번째 결과를 삭제
    - `fullGetter()`:
        - 모든 계산 기록 출력

## 사용 방법
1. `App` 클래스를 실행합니다.
2. 첫 번째 숫자, 두 번째 숫자, 연산자를 순서대로 입력합니다.
3. 계산 결과가 출력되며, 현재까지의 계산 기록이 표시됩니다.
4. 다음 옵션 중 하나를 선택합니다:
    - `remove` 입력: 계산 기록에서 첫 번째 결과부터 순차적으로 삭제
    - `edit` 입력: 특정 인덱스의 계산 결과를 수정
    - 다른 키 입력: 다음 계산 진행
6. 프로그램 종료를 원하면 `exit`를 입력, 계산을 더 수행하고 싶은 경우 `continue`를 입력

## 예외 처리
- 정수가 아닌 값 입력 시: "정수를 입력하세요." 메시지 출력
- 음수 입력 시: "0을 포함한 양수를 입력하세요." 메시지 출력
- 유효하지 않은 연산자 입력 시: "입력할 수 있는 연산자는 오직 +, -, *, / 입니다." 메시지 출력
- 나눗셈에서 0으로 나누기 시도 시: "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다." 메시지 출력

## 요구 사항
- Java Development Kit (JDK) 8 이상

## 실행 방법
1. 프로젝트를 클론합니다:
```bash
https://github.com/your-repo/calculator-project.git
```
2. Java 파일을 컴파일합니다:
```bash
javac -d . ./src/org/example/calculator/*.java ./src/org/example/calculator2/*.java
```
3. `App` 클래스를 실행합니다:
```bash
java org.example.calculator.App
```

## 프로젝트 구조
```
calculator-project/
├── src/
│   ├── org/example/calculator/
│   │   └── App.java
│   ├── org/example/calculator2/
│   │   └── Calculator2.java
└── README.md
```

## 기여 방법
1. 이 저장소를 포크합니다.
2. 새 브랜치를 생성합니다: `git checkout -b feature/your-feature`
3. 변경 사항을 커밋합니다: `git commit -m 'Add some feature'`
4. 브랜치에 푸시합니다: `git push origin feature/your-feature`
5. Pull Request를 엽니다.

