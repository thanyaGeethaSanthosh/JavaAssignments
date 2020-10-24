public class LargestInIntegerArray {

  public static int getLargestInIntegerArray(int[] listOfNumbers) {
    int largest = listOfNumbers[0];

    for (int number : listOfNumbers) {
      largest = Math.max(largest, number);
    }

    return largest;
  }

  public static void main(String[] args) {
    int[] listToFindLargest = { 3, 5, 2, 8, 9, 1 };

    System.out.println(getLargestInIntegerArray(listToFindLargest));
  }
}
