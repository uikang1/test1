package Loopcon;

public class For3 {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      System.out.print(i+ "");
      if (i % 10 == 0) {
        System.out.println();
      }
    }
    System.out.println("/////");

    for( char ch = 'a' ; ch <='z'; ch++){
      System.out.print(ch + ",");
    }

  }
}

