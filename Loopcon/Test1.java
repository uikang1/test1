package Loopcon;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    int num1, num2, sum = 0;
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("정수1:");
      num1 = scanner.nextInt();
      System.out.println("정수2:");
      num2 = scanner.nextInt();
      sum = num1 + num2;
      if (num1 == 0 && num2 ==0){
        System.out.println("종료");
        break;
      }
      System.out.println("두수의 합 :" + sum);
    }
  }
}
