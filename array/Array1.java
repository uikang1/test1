package array;

public class Array1 {
  public static void main(String[] args) {
    // 음식 주문 - 문자열
    // 배열 선언 : 타입이 동일한 연속공간 선언
    //String[] foods = new String[5];
    //String foods[] = new String[5];

    //배열의 방의 개수 - foods.length
    //값이 간단하면 초기화
    //String[] foods = new String[]{"라면" , "우동" , "불고기" , "라멘" , "김치우동"};
    String[] foods = new String[5];

    for (int i = 0; i < foods.length ; i++){
      System.out.println((i+1) +"번째 사람 메뉴주문");
    }

    // 다른 자료형
    int[] x = new int[3];
    x[0] = 10 ;
    x[1] = 10 ;
    x[2] = 10 ;

    double[] d = new double[] {10.2 , 11.6 , 20.33};
    boolean[] b = {true , false ,true};



  }
}
/*
 변수로  처리할경우

 단 주문자가 30 일때?

STEP 1

*  String food1 = "라면";
    String food2 = "우동";
    String food3 = "햄버거";
    String food4 = "김밥";
    String food5 = "밥";

    System.out.println(food1 + "하나주문");
    System.out.println(food2 + "하나주문");
    System.out.println(food3 + "하나주문");
    System.out.println(food4 + "하나주문");
    System.out.println(food5 + "하나주문");
    System.out.println("하겠습니다. 주문완료");
  }
*
 STEP 2
* String foods[] = new String[5];

    foods[0] = "라면";
    foods[1] = "우동";
    foods[2] = "햄버거";
    foods[3] = "김밥";
    foods[4] = "밥";

    System.out.println(foods[0] + "하나주문");
    System.out.println(foods[1] + "하나주문");
    System.out.println(foods[2] + "하나주문");
    System.out.println(foods[3] + "하나주문");
    System.out.println(foods[4] + "하나주문");
    System.out.println("하겠습니다. 주문완료");
*

STEP 3
 // 음식 주문 - 문자열
    // 배열 선언 : 타입이 동일한 연속공간 선언
    //String[] foods = new String[5];
    String foods[] = new String[5];

    foods[0] = "라면";
    foods[1] = "우동";
    foods[2] = "햄버거";
    foods[3] = "김밥";
    foods[4] = "밥";

    for (int i = 0; i < 5 ; i++){
      System.out.println(foods[i] +"하나주문");
    }
    //배열의 방의 개수 - foods.length
    for (int i = 0; i < foods.length ; i++){
      System.out.println(foods[i] +"하나주문");
    }





 */




