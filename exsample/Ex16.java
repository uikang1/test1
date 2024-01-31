package exsample;

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1=0 , num2=0 , num3=0 , result=0;
    String op = "";
    System.out.println("계산기 만들기");
    System.out.println("------------------------");

    while (true) {
      System.out.println("1번 정수:");
      num1 = scanner.nextInt();
      System.out.println("2번 정수:");
      num2 = scanner.nextInt();
      System.out.println(" 연산자 선택 :종료 : end , +, -, *, /, % ");

      scanner.nextLine();
      op = scanner.nextLine();

      if (op.equals("end") ) break;
      System.out.println("계산기 프로그램 종료");
      switch(op){
        case "+" : result = num1 + num2 ;break;
        case "-" : result = num1 - num2 ;break;
        case "*" : result = num1 * num2 ;break;
        case "/" : result = num1 / num2 ;break;
        case "%": result = num1 % num2 ;break;
        default:
          System.out.println("잘못된 연산자입니다.");
      }
      if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%") ) {
        System.out.println(num1 + op + num2 + "=" + result);
      }
    }
  }
}
