package Condition;

// 삼항연산자
// 형식 : (조건) ? 참결과 : 거짓결과
// if ~ else 삼항으로 바꿔서 가능하다
//
public class Con1 {
  public static void main(String[] args) {
    int age = 20;
    String result = ( age >= 18 ) ? "성년" : "미성년";
    System.out.println( result );

    int x = 3; // 짝수 , 홀수
    String result2 = ( x % 2 == 0 ) ? "짝수" : "홀수";
    System.out.println( result2 );

    int score = 85 ; // 합격 , 불합격
    String result1 = ( score >= 85) ? "합격" : "불합격";
    System.out.println( result1 );
  }
}
