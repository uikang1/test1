package exsample;

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 0 , sum = 0;
    System.out.println("정수입력");
    x= scanner.nextInt();
    for (int i = 0 ; i <= x ; i++ );
    if (x % 2 == 0 ){
      sum += x;
    }
    System.out.println("총 짝수의 합:"+ sum);
  }

}
