public class Range {

  public static void printIntegerList(int[] list) {
    for (int number : list) {
      System.out.println(number);
    }
  }

  public static int[] getRange(int from, int to, int step) {
    int rangeLength = ((to - from - 1) / step) + 1;
    int[] range = new int[rangeLength];
    int num = from;

    for (int index = 0; index < rangeLength; index++) {
      range[index] = num;
      num += step;
    }

    return range;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);

    int step = args.length > 2 ? Integer.parseInt(args[2]) : 1;

    printIntegerList(getRange(from, to, step));
  }
}
