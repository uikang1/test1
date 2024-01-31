package array;

public class Array4 {
  public static void main(String[] args) {
    int[] sizearray = new int [10];
    for (int i = 0; i < sizearray.length; i++){
      sizearray[i] = 250 + (5 * i);
    }
    for (int size : sizearray){
      System.out.println("사이즈" + size + "(재고있음)");
    }
  }
}
