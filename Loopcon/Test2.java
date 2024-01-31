package Loopcon;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
     int num1 , num2, result=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수1:");
    num1 = scanner.nextInt();
    System.out.println("정수2:");
    num2 = scanner.nextInt();
    result = num1 + num2;
    System.out.println("연산자: "+ result);
  }
}
