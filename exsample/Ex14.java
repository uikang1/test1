package exsample;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String strNum = "";
    int speed = 0;
    while (true){
      System.out.println("--------------------------------------------------------------------");
      System.out.println("1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프 종료) :");
      System.out.print("--------------------------------------------------------------------");
      System.out.println("선택 : ");
      strNum = scanner.nextLine();

      if (strNum.equals("1")) {
        speed++;
        System.out.println("speed : " + speed);
      }else if(strNum.equals("2")) {
        speed--;
        System.out.println("speed :" + speed);
      }else if(strNum.equals("3")){
        System.out.println("종료");
        break;
      }
    }
  }
}
