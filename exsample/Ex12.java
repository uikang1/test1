package exsample;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int kor = 0, eng = 0, mat = 0,  sum= 0;
    String name = "" , hak ="";
    double avg = 0;
    System.out.print(" 이름 : ");
    name = scanner.nextLine();
    System.out.print(" 국어 : ");
    kor = scanner.nextInt();
    System.out.print("영어 :");
    eng = scanner.nextInt();
    System.out.print(" 수학 :");
    mat = scanner.nextInt();
    sum = kor + mat + eng;
    System.out.println("총점 :" + sum);
    avg = sum / 3.0;
    System.out.println("평균 :" + avg);

    if (avg >= 90){
      hak = "A";
    }else if (avg >= 80 ){
      hak = "B";
    }else if (avg >= 70){
      hak = "C";
    }else if (avg >= 60){
      hak = "D";
    }else {
      System.out.println("그외 학점은 F");
    }
    System.out.println( name+" 총점은" + sum + "평균은"+avg + "이며 학점은"+hak+"이다");
  }
}
