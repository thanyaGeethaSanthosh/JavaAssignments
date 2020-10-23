public class MultiplicationTable {

  public static void printMultiplicationTable(int multiplier, int factor) {
    for (int i = 1; i <= factor; i++) {
      System.out.println(multiplier + " X " + i + " = " + multiplier * i);
    }
    return;
  }

  public static void main(String[] args) {
    int multiplier = Integer.parseInt(args[0]);
    int factor = Integer.parseInt(args[1]);
    printMultiplicationTable(multiplier, factor);
  }
}
