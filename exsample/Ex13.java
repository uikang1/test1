package exsample;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    //while + true + if + break
    Scanner scanner = new Scanner(System.in);
    String name = "";
    int age = 0;
    while (true) {
      System.out.println("나이입력");
      age = scanner.nextInt();
      
      
      System.out.println("이름 입력: 종료(x)");
      scanner.nextLine(); // 버퍼의 엔터처리
      name = scanner.nextLine();
      //엔터키가 입력되면 지금까지 입력한 모든 내용을 읽는다.
      //버퍼에 남아있는 엔터키가 들어간다
      
      if (name.equals("x")) {
        System.out.println("프로그램 종료");
        break;
      }
      System.out.println("이름 :" + name + "나이 :" + age);
    } // end while
  }
}
/*
*  Scanner scanner = new Scanner(System.in);
    int num1 = 0 , num2 = 0 , sum = 0;
    //for ( ; ; )
    while (true) {
      System.out.println("정수 1 :");
      num1 = scanner.nextInt();
      System.out.println("정수2 :");
      num2 = scanner.nextInt();
      // 둘중에 하나라도 0이면 종료
      if (num1 == 0 || num2 == 0){
        System.out.println("프로그램 종료");
        break;
      }
      sum = num1 + num2;
      System.out.println("두수의 합 :" + sum);
      System.out.println("-------------");
    } // end while
*
*
*
* */
