package Condition;

public class Test2 {
  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int dis = 1000;
    if (price >= 10000) {
      System.out.println("10000원 이상 구매, 1000원할인");
    }
    if (age <= 10){
      System.out.println("어린이 1000원 할인");
    }
    if (dis == 1000){
      System.out.println("총할인금액 :" +  dis);
    }
  }
}
