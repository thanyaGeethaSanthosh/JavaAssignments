public class Fibonacci {

  public static void printFibonacci(int limit) {
    int num1 = 0;
    int num2 = 1;

    System.out.println(num1);

    for (int i = 0; i < limit; i++) {
      System.out.println(num2);
      int temp = num1 + num2;
      num1 = num2;
      num2 = temp;
    }
  }

  public static void main(String[] args) {
    int limit = Integer.parseInt(args[0]);
    printFibonacci(limit);
  }
}
