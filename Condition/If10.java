package Condition;
//if ~ else
// 정수 num의 결과 짝수 , 홀수
public class If10 {
  public static void main(String[] args) {
    int num = 19;
    if (num % 2 == 0) { // num 이로 나눈 나머지가 0이면 짝수
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}
