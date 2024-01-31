package loopcon1;

public class For1 {
  public static void main(String[] args) {
    for ( int i = 0 ; i <= 2 ; i++ ){
      System.out.println("===== 이중 for 문 =========");
      for (int j = 0 ; j <= 2 ; j++){
        System.out.print("i = "+i+" / j =" + j +" , ");
      }
      System.out.println();
    }// for i
  }//end main
}// end class
/*
* for 2중 : 변수 사용자 정의 / 3중 / 4중
*  i , j , k
*
* for ( 초기값 ; 조건식 ; 증감식) {
*     for (초기값 ; 조건식 ; 증감식 ) {
*     실행문
* }
*  for ( 초기값 ; 조건식 ; 증감식) {
 *     for (초기값 ; 조건식 ; 증감식 ){
 *  }
 * 실행문
 * }
 *
 * for ( int i = 0 ; i <= 2 ;  i++) { // 행
 *     for ( int j = 0 ; j <= 2 ; j++ ) { // 열
 *     실행문
 * }
 *}
 *        열 (j)
 * 실행 순서
 * 행(i) 0 :  0   1   2
 * 행(i) 1 :  0   1   2
 * 행(i) 2 :  0   1   2
 * for ( 0 ; 1,12 ;  11) { // 행
 *     for ( 2 ; 3,6,9 ; 5,8 ) { // 열
 *     4실행문7
 * }
 * 10 j for 문 벗어남
 *}
 *
 *
 *
 *
 * 행        열
 * i = 0 , j = 0
 * i = 0 , j = 1
 * i = 0 , j = 2
 *
 * i = 1 , j = 0
 * i = 1 , j = 1
 * i = 1 , j = 2
 *
 * i = 2 , j = 0
 * i = 2 , j = 1
 * i = 2 , j = 2
 *
 *
 *
**/