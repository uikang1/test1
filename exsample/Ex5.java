package exsample;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    System.out.print("정수입력 : ");
    num = scanner.nextInt();
    if (num % 2 == 0 ){
      System.out.print("입력한 정수 "+ num + "짝수");
    }else if (num % 2==1){
      System.out.print("입력한 정수" + num+"은 홀수");
    }
  }
}
