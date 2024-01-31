package array;

public class Array3 {
  public static void main(String[] args) {
    // 배열3 -> 각각 a 코스 . b코스 , c 코스
    String[] arrA = {"A1", "A2", "A3"};
    String[] arrB = {"B1", "B2", "B3"};
    String[] arrC = {"C1", "C2", "C3"};
    System.out.println("arrA[2] :" + arrA[2]);
    System.out.println("arrC[2] :" + arrC[1]);
    System.out.println("========================");
    //2차원 배열
    String[][] arrs = new String[][]{
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3"},
        {"C1", "C2", "C3"}
    };
    System.out.println("a2:" + arrs[0][1]);
    System.out.println("c3:" + arrs[2][2]);
    System.out.println("=======================");

    // 2차원 배열 2중 for문 출력
    for (int i = 0; i < arrs.length ; i++){ // [행][열] => i 행
      for (int j = 0;  j < arrs[i].length ; j++){ //[행][열] => j 열
        System.out.print(arrs[i][j] + "" );
      }
      System.out.println();
    }
    String[][] arrs1 = new String[][]{
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3" , "B4"},
        {"C1", "C2", "C3" , "C4" , "C5"}
    };
    System.out.println("2차원 배열 , 열의 개수 다르게");
    for (int i = 0; i < arrs1.length ; i++){
      for (int j = 0; j < arrs1[i].length ; j++){
        System.out.print(arrs1[i][j] + " , " );
      }
      System.out.println();
    }


  }
}
/*
*  String[][] arrs = new String[][]{
*        열  0   1     2
     행 0 {"A1", "A2", "A3"} ,
        1 {"B1", "B2", "B3"} ,
        2 {"C1", "C2", "C3"}
    };
*
*
* */