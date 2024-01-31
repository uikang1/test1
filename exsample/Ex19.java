package exsample;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int money = 0, inmoney = 0, outmoney = 0 ;
    int num = 0;
    while (true) {
      System.out.println("----------------------------");
      System.out.println("1. 예금 2. 출금 3. 잔고 4.종료");
      System.out.println("----------------------------");
      System.out.print("선택> :");
      num = scanner.nextInt();

      if (num == 1) {
        System.out.print("예금액> :");
        inmoney = scanner.nextInt();
        money += inmoney;
      }else if (num == 2){
        System.out.print("출금액> :");
        outmoney = scanner.nextInt();
        //if 양수 , 양수 - 음수 : 대출
        money -= outmoney;
      }else if (num == 3 ) {
        System.out.println("잔고>:" + money + "원");
        money = inmoney - outmoney;
      }else if (num == 4){
        System.out.println("종료");
        break;
      }else if (num > 4){
        System.out.println("선택범위 초과");
      }


    } // while
  } //main
}
