package Condition;
//if ~ else
// num 정수가 양수 , 음수
public class If9 {
  public static void main(String[] args) {
    int num = 0 ;
    //if (num >= 0) {
    if (num > 0 || num == 0) {
      System.out.println("양수 또는 0이다");
    }else{
      System.out.println("음수 또는 0이다");
    }
  }
}
/*
* int num = -1 ;
    if (num > 0) {
      System.out.println("양수");
    }else{
      System.out.println("음수");
    }
*
* */