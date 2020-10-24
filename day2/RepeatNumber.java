public class RepeatNumber {

  public static void printIntegerList(int[] list) {
    for (int number : list) {
      System.out.println(number);
    }
  }

  public static int[] getRepeatedList(int integer, int times) {
    int[] repeatedList = new int[times];

    for (int index = 0; index < times; index++) {
      repeatedList[index] = integer;
    }

    return repeatedList;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int integer = Integer.parseInt(args[0]);
    int times = Integer.parseInt(args[1]);

    printIntegerList(getRepeatedList(integer, times));
  }
}
