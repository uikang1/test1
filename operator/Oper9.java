package operator;

// 비교연산자
public class Oper9 {
  public static void main(String[] args) {
    System.out.println("&&:AND 연산자"); // 둘다 true => true
    System.out.println("true && true");
    System.out.println("true && false");
    System.out.println("false && false");

    System.out.println("||: or 또는");
    System.out.println( true || true );
    System.out.println( true || false );
    System.out.println( false || false );

    System.out.println("!:not 부정연산자");
    System.out.println( !true ); // false
    System.out.println( !false ); // true

    System.out.println("변수 + 논리 연산자");
    boolean a = true;
    boolean b = false;
    System.out.println( a && b );
    System.out.println( a || b );
    System.out.println( !a );
    System.out.println( !b );

    System.out.println("논리 연산자 응용");
    int x = 5;
    boolean result ; // x가 10보다 크고 20 작다 => true/false

    // 크다 , 작다 : 관계 연산자 , ~ 이고 , ~또는 : 논리연산자
    //result = x > 10 && x < 20;
    result = (x > 10) && (x < 20);
    System.out.println("결과 : " + result);

    System.out.println("논리연산응용2 ");
    int score = 70;
    boolean result1 ;
    result1 = (score >= 80) && (score <= 100);
    System.out.println("결과 : " + result1);
  }
}
