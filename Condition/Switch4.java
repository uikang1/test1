package Condition;

public class Switch4 {
  public static void main(String[] args) {
    int month = 2, day = 0;
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) {
      day = 31;
    }else if(month == 4 || month == 6 || month == 9 || month == 11){
      day = 30;
    }else if (month == 2){
      day = 29;
    }else
      System.out.println("해당월은 존재하지 않습니다");
    if (month >= 1 && month <= 12){
      System.out.println(month+"월은"+day+"까지입니다.");
    }
  }
}
