public class LargestOfThree {

  public static int maxOfTwo(int num1, int num2) {
    return ((num1 + num2) + Math.abs(num1 - num2)) / 2;
  }

  public static void main(String[] args) {
    int largest = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    largest = maxOfTwo(largest, num2);
    largest = maxOfTwo(largest, num3);

    System.out.println(largest);
  }
}
