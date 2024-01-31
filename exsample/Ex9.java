package exsample;

import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    String hak = "";
    System.out.println("점수를 입력하세요:");
    System.out.println("점수:");
    score = scanner.nextInt();
    if (score >= 90){
      hak = "A";
    }else if (score >= 80){
      hak = "B";
    }else if (score >= 70){
      hak = "C";
    }else if (score > 60){
      hak = "D";
    }else{
      System.out.println("그 외 학점은 F 입니다.");
    }
  }
}
/*
*  Scanner scanner = new Scanner(System.in);
    int score;
    System.out.println("점수:");
    score = scanner.nextInt();
    if (score >= 90){
      System.out.println("A");
    }else if (score >= 80){
      System.out.println("B");
    }else if (score >= 70){
      System.out.println("C");
    }else if (score > 60){
      System.out.println("D");
    }else{
      System.out.println("그 외 학점은 F 입니다.");
    }
*
*
*
*
*
*
*
* */
