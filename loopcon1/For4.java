package loopcon1;

public class For4 {
  public static void main(String[] args) {
   int result = 0;
   for (int i = 2; i <= 9 ; i++){
     System.out.println("====="+2+"단"+"=========");
     for (int j = 1; j <=9 ; j++){
       result = i * j;
       System.out.println(i+"x"+j+"="+result);
     } //for
     System.out.println();
     System.out.println();
   }
  }
}
/*
* ============ 1단 ===========
* ...2
*
*
*
* Scanner scanner = new Scanner(System.in);
    int dan = 0 , result = 0;
    dan = scanner.nextInt();
    System.out.println("========="+dan+"단"+"=============");
    for (int i = 0; i <= 9; i++){
      result = dan * i;
      System.out.println(dan+" * "+i+"="+result);
    } //for i
* */
