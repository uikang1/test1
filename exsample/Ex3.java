package exsample;

//while문
public class Ex3 {
  public static void main(String[] args) {
    // 1부터 10 까지 합
    int x = 1 , max = 10 , sum = 0; // i 변수에 1을 대입
    while(x <= max){
      //실행문 , 출력문 ..
      sum += x;
      System.out.println("합: " + sum );

      //증감식
      x++;

    }// end while
  } // end main
}

/*
*
*   // 1부터 10 까지 합
    int x = 1 , max = 10 , sum = 0; // i 변수에 1을 대입
    while(x <= max){
      //실행문 , 출력문 ..
      sum += x;
      System.out.println("합: " + sum );
      //증감식
      x++;

    }// end w
*
*
* */
