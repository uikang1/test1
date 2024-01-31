package variable;

public class Var5 {
  public static void main(String[] args) {
    // 변수 선언
    String name , tel;
    int year , month , day;
    boolean married;
    // 값 할당
     name =  "홍길동";
     tel = "010-1234-5678";
     year = 2024;
     month = 3;
     day = 15;
     married = false;

    System.out.println("이름 : " + name );
    System.out.println("생일 : " + year+ "년"+month+ "월"+day+ "일" );
    System.out.println("연락처 : " + tel );
    System.out.println("결혼 : " + married );
  }
}
