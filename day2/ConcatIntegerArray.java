public class ConcatIntegerArray {

  public static void printIntegerList(int[] list) {
    for (int number : list) {
      System.out.println(number);
    }
  }

  public static int[] copyTo(int[] srcArray, int[] destArray, int fromIndex) {
    int index = fromIndex;

    for (int number : srcArray) {
      destArray[index] = number;
      index++;
    }

    return destArray;
  }

  public static int[] concatIntegerArray(int[] list1, int[] list2) {
    int[] concatedArray = new int[list1.length + list2.length];
    concatedArray = copyTo(list1, concatedArray, 0);
    concatedArray = copyTo(list2, concatedArray, list1.length);

    return concatedArray;
  }

  public static void main(String[] args) {
    int[] list1 = { 3, 5, 2, 8, 9 };
    int[] list2 = { 1, 2, 3, 4, 4, 5 };

    printIntegerList(concatIntegerArray(list1, list2));
  }
}
