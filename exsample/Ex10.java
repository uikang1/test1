package exsample;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dollar = 0 , result = 0;
    System.out.println("달러를 입력하세요 : ");
    dollar= scanner.nextInt();
    
    if (dollar < 0 ) {
      System.out.println("잘못된 금액입니다");
    }else if (dollar == 0) {
      System.out.println("환전할 금액이없습니다");
    }else {
      result = dollar * 1300;
      System.out.println("환전금액은" + result + "원" );
    }
    
  }
}
