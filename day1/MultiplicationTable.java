public class MultiplicationTable {

  public static void main(String[] args) {
    int multiplier = Integer.parseInt(args[0]);
    int count = Integer.parseInt(args[1]);
    for (int i = 1; i <= count; i++) {
      System.out.println(multiplier + " X " + i + " = " + multiplier * i);
    }
  }
}
