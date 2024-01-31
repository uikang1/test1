package exsample;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price, age, discount = 0;
    System.out.println("금액:");
    price = scanner.nextInt();
    System.out.println("나이");
    age = scanner.nextInt();
    if ( price >= 10000 && age <= 10) {
    discount += 2000;
      System.out.println("10000원 이상구매 , 1000원 할인");
      System.out.println("어린이는 1000원 할인");
    }else if (price >= 10000 || age <= 10) {
      discount += 1000;
      System.out.println("10000 원이상구매 또는 어린이 , 1000원 할인");
    } else if (age <= 10) {
      discount += 1000;
      System.out.println("어린이는 1000원 할인");
    } else {
      discount = 0;
      System.out.println("1000원 할인이 불가능");
    }
    System.out.println("총할인 금액 : " + discount + "원");
  }
}

/*
*   int price , age , discount = 0;
    price = 10000;
    age = 5;


    if ( price >= 10000) {
      discount += 1000;
      System.out.println("10000원 이상 , 1000원 할인");
    } //if 문
    //나이
    if ( age <= 10 ){
      discount += 1000;
      System.out.println("어린이 1000원 할인");
    }// if 문
    System.out.println("총할인 금액 : " +discount + "원");
*
*
* price = 10000;
    age = 5;
    if ( price >= 10000) {
      discount += 1000;
      System.out.println("10000원 이상 , 1000원 할인");
    } //if
    //나이
    if ( age <= 10 ){
      discount += 1000;
      System.out.println("어린이 1000원 할인");
    }// if 문
    System.out.println("총할인 금액 : " +discount + "원");
*
*
*
*
*
* Scanner scanner = new Scanner(System.in);
    int price, age, discount = 0;
    System.out.println("금액:");
    price = scanner.nextInt();
    System.out.println("나이");
    age = scanner.nextInt();

    if (price >= 10000) {
      discount += 1000;
      System.out.println("10000 원이상구매 , 1000원 할인");
    } else if (age <= 10) {
      discount += 1000;
      System.out.println("어린이는 1000원 할인");
    } else {
      discount = 0;
      System.out.println("1000원 할인이 불가능");
    }
    System.out.println("총할인 금액 : " + discount + "원");
*
*
*
*
*
*
*
* */