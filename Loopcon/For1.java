package Loopcon;

public class For1 {
  public static void main(String[] args) {
    // 1 부터 10 까지 1씩 증가
    // 반복문 변수는 임의 설정가능 a, x ? i , j  , k ...
    for (int i = 1; i<=10; i++) {
      System.out.print( ", "+ i ) ;
      //i 변수는 {} 스코프(영역) 안에서 사용 - 지역변수
    }// end for

    System.out.println();
    System.out.println(" ===2번째===");
    for (int i = 1; i <= 10 ; i=i+1){
      System.out.print( ", "+ i ) ;
    }//end for

  }
}
