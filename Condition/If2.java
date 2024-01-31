package Condition;
// 단일 if문
// 나이가 , age가 20 이상이면 성인
// 나이가 18 미만이면 미성년
public class If2 {
  public static void main(String[] args) {
    int age = 18;
    if (age >= 20){
      System.out.println("성인");
    }
    if (age <= 18){
      System.out.println("미성년자");
    }
  }
}
