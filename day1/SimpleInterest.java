public class SimpleInterest {

  public static double simpleInterest(int principle, int rate, int period) {
    return (principle * rate * period) / 100;
  }

  public static void main(String[] args) {
    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    System.out.println(simpleInterest(principle, rate, period));
  }
}
