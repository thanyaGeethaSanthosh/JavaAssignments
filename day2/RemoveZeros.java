public class RemoveZeros {

  public static void printIntegerList(int[] list) {
    for (int number : list) {
      System.out.println(number);
    }
  }

  public static int countNonZero(int[] list) {
    int count = 0;
    for (int number : list) {
      if (number != 0) {
        count++;
      }
    }
    return count;
  }

  public static int[] removeZeros(int[] numberList) {
    int length = countNonZero(numberList);
    int[] removedArray = new int[length];
    int newArrayIndex = 0;
    for (int index = 0; index < numberList.length; index++) {
      if (numberList[index] != 0) {
        removedArray[newArrayIndex] = numberList[index];
        newArrayIndex++;
      }
    }
    return removedArray;
  }

  public static void main(String[] args) {
    int[] list1 = { 3, 5, 0, 2, 8, 0, 9 };

    printIntegerList(removeZeros(list1));
  }
}
