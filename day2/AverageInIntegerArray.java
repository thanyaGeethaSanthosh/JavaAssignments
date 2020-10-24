public class AverageInIntegerArray {

  public static int getAverageInIntegerArray(int[] listOfNumbers) {
    int sum = 0;

    for (int number : listOfNumbers) {
      sum += number;
    }

    return sum / listOfNumbers.length;
  }

  public static void main(String[] args) {
    int[] listToFindAverage = { 3, 5, 2, 8, 9, 1 };

    System.out.println(getAverageInIntegerArray(listToFindAverage));
  }
}
