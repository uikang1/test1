package Condition;

public class Switch6 {
  public static void main(String[] args) {
    int month = 5;
    String result = ""; // result = null

    switch (month) {
      case 3:
      case 4:
      case 5:
        result = "봄";
        break;
      case 6, 7, 8:
        result = "여름";
        break;
      case 9:
      case 10:
      case 11:
        result = "가을";
        break;
      case 12:
      case 1:
      case 2:
        result = "겨울";
        break;
      default:
        System.out.println("해당월은 존재하지 않습니다");
    }
    if (month >= 1 && month <= 12) {
      System.out.println(month + "월은" + result);
    }
  }
}

  /*
  * int x = 3;
    String result = switch (x) {
      case 1 -> "운동화" ;
      case 3 , 4 -> "화장품" ;
      case 5 -> "구두" ;
      case 9 -> result = "상품권" ;
      default -> result = "꽝 다음기회에";
    };
    System.out.println( result )
  *
  *
  * */

