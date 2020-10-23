public class GreatestCommonDevisor {

  public static int greatestCommonDevisor(int num1, int num2) {
    int gcd = ((num1 + num2) - Math.abs(num1 - num2)) / 2;

    while (num1 % gcd != 0 || num2 % gcd != 0) {
      gcd--;
    }

    return gcd;
  }

  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println(greatestCommonDevisor(num1, num2));
  }
}
