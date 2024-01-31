package operator;

//1. 산술 연산자 +,-,*,/,%
public class Oper1 {
  public static void main(String[] args) {
    int x , y ;
    int sum , mul , sub , div , mod ;

    x = 30 ;
    y = 4 ;

    sum = x+y ; // 합 : 34
    sub = x-y ;
    mul = x * y ;
    div = x / y ; // x/0 => 0으로 나눌 수 없다.
    mod = x % y ; // int % int => int
    // double mod = (double) x % y => 둘중에 하나를 형변환

    System.out.println("합 : " + sum);
    System.out.println("차 : " + sub);
    System.out.println("곱 : " + mul);
    System.out.println("몫 : " + div);
    System.out.println("나머지 : " + mod );
  }
}
