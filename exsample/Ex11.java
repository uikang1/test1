package exsample;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("등급을 입력하시오 :");
    String grade = "";
    String result = "";
    grade = scanner.nextLine();
    result = switch (grade) {
      case "A" ->"최고점수";

      case "B" ->"시험에통과";

      case "C" ->"노력이필요";

      case "D"->"재시험";

      case "F" ->"불합격재시험불가";

      default ->"그외는 잘못된 확정";
    };
    System.out.println( result );
  }
}
/*
* Scanner scanner = new Scanner(System.in);
    System.out.println("등급을 입력하시오 :");
    String grade = "";
    grade = scanner.nextLine();
    switch (grade) {
      case "A":
        System.out.println("최고점수");
        break;
      case "B":
        System.out.println("시험에통과");
        break;
      case "C":
        System.out.println("노력이필요");
        break;
      case "D":
        System.out.println("재시험");
        break;
      case "E":
        System.out.println("불합격재시험불가");
        break;
      default:
        System.out.println("그외는 잘못된 확정");
    }
  }
}
*
*
* */
