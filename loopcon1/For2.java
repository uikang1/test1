package loopcon1;

import java.util.Scanner;

public class For2 {
  public static void main(String[] args) {
    // dan , result
    Scanner scanner = new Scanner(System.in);
    System.out.print("몇단 : ");
    int dan = 0 , result = 0;
    dan = scanner.nextInt();
    for (int i = 1;  i <= 9 ; i++ ){
      result = dan * i ;
      System.out.println(dan + " x "+ i +"="+ result );
    }

  }
}
/*
*  2단 출력
*  2 * 1 = 2
*  2 * 2 = 4
*  2 * 3 = 6
* */
