public class LargestOfThree {

  public static void main(String[] args) {
    int largest = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    if (largest < num2) {
      largest = num2;
    }

    if (largest < num3) {
      largest = num3;
    }

    System.out.println(largest);
  }
}
