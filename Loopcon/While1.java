package Loopcon;

public class While1 {
  public static void main(String[] args) {
    // 무한루프 처리 할때 많이 사용한다
    // 1 ~ 10 까지 합을 구하고
    // 총합은 : xx
    int x = 0, sum = 0;
    while (x <= 30) {
      if (x % 2 == 0)
        sum += x;
      System.out.println(" x: " + x + " sum: " + sum);
      x++;
    }
    System.out.println("총합 :" + sum);
  }
}

/*
// 0~ 9까지 출력
* int x = 0;
    while (x < 10 ) {
      System.out.println("현재값 :" + x );
      x++;
*
* int x = 0 , sum = 0 ;
    while (x <= 10){
      sum += x;
      System.out.println(" x: "+x+" sum: "+sum);
      x ++;
    }
    //
    System.out.println("총합 :" +sum);
* */
