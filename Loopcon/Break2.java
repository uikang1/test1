package Loopcon;

public class Break2 {
  public static void main(String[] args) {
    // while 문 무한루프 true
    // x 10 넘으면 중단해라
    int x = 0;
    while( true ) {
      System.out.println( x );
      if( x== 10){
        break;
      }
      x++;
    }//end while
  }
}
