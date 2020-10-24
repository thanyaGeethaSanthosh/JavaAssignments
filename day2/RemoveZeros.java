public class RemoveZeros {

  public static void printIntegerList(int[] list) {
    for (int number : list) {
      System.out.println(number);
    }
  }

  public static int[] removeZeros(int[] numberList) {}

  public static void main(String[] args) {
    int[] list1 = { 3, 5, 2, 8, 9 };

    printIntegerList(removeZeros(list1));
  }
}
