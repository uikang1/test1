package Condition;
// 단일if문
public class If1 {
  public static void main(String[] args) {
    // 점수 변수의 값이 80 이상이면 합격  
    // 점수 변수의 값이 80 미만이면 불합격
    int score = 60;
    //조건 if문
    if ( score >= 80 ){ // 점수가 80보다 크면 참 결과
      System.out.println("합격");
    }
    if (score < 80) {
      System.out.println("불합격");
    }
  }
}
/* 
* * 1. 단일 if : 참결과
 * if ( 조건식 ) 참결과1 개
 * if ( 조건식) {
 * 참 결과
 * 참 결과
 * 참 결과
 * }*/