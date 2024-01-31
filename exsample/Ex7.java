package exsample;

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String foodname="";
    int fooodprice=0 , foodquntitiy=0 , foodtotal=0;
    System.out.println("음식명:");
    foodname = scanner.nextLine();
    System.out.println("음식가격:");
    fooodprice = scanner.nextInt();
    System.out.println("음식수량:");
    foodquntitiy = scanner.nextInt();
    foodtotal = fooodprice * foodquntitiy;
    System.out.print("음식이름 : " + foodname );
    System.out.print("음식 수량 : " + foodquntitiy+"개" );
    System.out.print("금액 : " + foodtotal+"원" );



  }
}
