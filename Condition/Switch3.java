package Condition;

public class Switch3 {
  public static void main(String[] args) {
    int month = 1, day = 0;

    switch (month){
      case 1 : day = 31; break;
      case 2 : day = 29; break;
      case 3 : day = 31; break;
      case 4 : day = 30; break;
      case 5 : day = 31; break;
      case 6 : day = 30; break;
      case 7 : day = 31; break;
      case 8 : day = 31; break;
      case 9 : day = 30; break;
      case 10 : day = 31; break;
      case 11 : day = 30; break;
      case 12 : day = 31; break;
      default : day = 0;
        System.out.println("해달월은 존재하지 않습니다");
    }
    if(month >= 1 && month <= 12) {
      System.out.println(month + "월은" + day);
    }
  }
}
