package Condition;

public class Switch1 {
  public static void main(String[] args) {
    /*
     변수 선언 정수형 : 초기값 선언하는것이 좋다
     자바 : 처음 실행 모두 처리한후 실행 에러의 경의 수가 없어야 한다
    * 회원 등급 쿠폰을 발급
    * 회원등급 ( 1 , 2 , 3 => grade )
    * 쿠폰 : coupon
    * 1 등급 : 쿠폰 3000원
    * 2 등급 : 쿠폰 2000원
    * 3 등급 : 쿠폰 1000원
    * 그 외 등급 : 500원
    * */
    // if 문 조건 관계 , 비교 + 산술등 - true/false
    // ~ 같다  : 분기형 switch ~ case 문 처리가속도 빠르다.
   int coupon , grade = 5;
   switch ( grade ) { // switch (변수)
     case 1 : //grade 가  1과 같으면 , if ( grade == 1)
       coupon = 3000; break ;
     case 2 : case 5: coupon = 2000 ; break ;
     case 3 : case 7: coupon = 1000 ; break ;
     default : coupon = 500;
   }
    System.out.println(grade+"등급 , 쿠폰" + coupon);
  }
}
/*
*  int coupon, grade = 5;
    if (grade == 1) {
      coupon = 3000;
    } else if (grade == 2) {
      coupon = 2000;
    } else if (grade == 3) {
      coupon = 1000;
    } else {
      coupon = 500;
    }
    if (grade >= 1 && grade < 3) {
      System.out.println(grade + "등급 / 쿠폰발급 : " + coupon);
    } else {
      System.out.println("해당등급은 쿠폰 :" + coupon + "원");
    }
*
* */
