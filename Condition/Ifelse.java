package Condition;

public class Ifelse {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int max = ( a > b ) ? a : b ;
    System.out.println( "최댓값 : " + max );


  }
}

/*
*
    if(a > b){
      max = a;
    } else if(a < b){
      max = b;
    }
    System.out.println( max );
*
*
*  if(a > b){
      max = a;
      //System.out.println("최대값" + a);
      System.out.println("최대값" + max);
    }
    if(a < b){
      max = b;
      System.out.println("최댓값" + max);
    }
*
*
*
*  if(a > b){
      max = a;
      //System.out.println("최대값" + a);
      System.out.println("최대값" + max);
    }else {
      max = b;
      System.out.println("최댓값 : " + max);
    }
*
*  */