package Condition;

public class If13 {
  public static void main(String[] args) {
    int x = 13;
    if ( x < 7 ){
      System.out.println("미취학");
    }else if( x > 8 && x <= 13 ){
      System.out.println("초등학생");
    }else if( x > 14 && x <= 16 ){
      System.out.println("중학생");
    }else if( x > 17 && x <= 19){
      System.out.println("고등학생");
    }else if(x > 20){
      System.out.println("성인");
    }
  }
}
