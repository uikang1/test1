package Condition;
//if ~ else 문
public class If14 {
  public static void main(String[] args) {
    int age = 16;
    String addr = "인천";
    if (age >= 16 && addr.equals("인천")){
      System.out.println("가입가능");
    }else{
      System.out.println("가입 불가능");
    }
  }
}
