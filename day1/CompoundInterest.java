public class CompoundInterest {

  public static double compoundInterest(int principle, int rate, int period) {
    double interest = (Math.pow(rate + 1, period) * principle) - principle;
    return interest;
  }

  public static void main(String[] args) {
    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    System.out.println(compoundInterest(principle, rate, period));
  }
}
