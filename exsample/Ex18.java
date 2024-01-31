package exsample;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] korScores;
    korScores = new int[5];
    int sum = 0;
    double avg = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("학생" + (i+1) + "번의국어 :");
      korScores[i] = scanner.nextInt();
      sum += korScores[i];
    }
    for (int i = 0; i < korScores.length; i++) {
      System.out.println("korScores[" + i + "] :" + korScores[i]);
    }
    avg = (double) sum / korScores.length;
    System.out.println("평균 : "+ avg);
  }
}
