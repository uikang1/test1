package array;

import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String foods[] = new String[5];
    for (int i = 0 ; i < foods.length ; i++ ) {
      System.out.println((i + 1) + "번쩨사람 메뉴 주문");
      foods[i] = scanner.nextLine();
    }
    for (int i = 0 ; i < foods.length ; i++ ) {
      System.out.println((i + 1) + "번쩨사람 메뉴 주문");
      System.out.println(foods[i]+"하나 주문");
    }
    for (String item: foods){
      System.out.println("확장 for : " + item);
    }
    // 확장 for 문 : for ~ each 문
    /*
    * for (탑입 변수 : 배열){
    *   배열의 개수만큼 반복
    *   반복하면 변수긱긱의 값을 대입
    * 
    * */
  }
}
