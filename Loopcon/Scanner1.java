package Loopcon;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    // 키보드로 값을 입력 받기
    Scanner scanner = new Scanner(System.in);
    System.out.print(" 문자열 입력 ");
    String str = scanner.nextLine();
    System.out.println("입력한 문자열 : " + str);

    System.out.print(" 정수입력 ");
    int x = scanner.nextInt();
    System.out.println("입력한 정수 :" + x);

    System.out.print(" 실수 입력 ");
    double y = scanner.nextDouble();
    System.out.println("입력한실수 :" + y);
  }
}
