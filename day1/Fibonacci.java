public class Fibonacci {

  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);
    int num1 = 0;
    int num2 = 1;
    System.out.println(num1);
    for (int i = 0; i < count; i++) {
      System.out.println(num2);
      int temp = num1 + num2;
      num1 = num2;
      num2 = temp;
    }
  }
}
