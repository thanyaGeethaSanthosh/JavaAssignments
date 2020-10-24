public class IsStrictAscending {

  public static boolean isStrictAcending(int[] listOfNumbers) {
    int index = 1;
    boolean greater = true;

    while (index < listOfNumbers.length && greater) {
      greater = listOfNumbers[index] > listOfNumbers[index - 1];
      index++;
    }
    return greater;
  }

  public static void main(String[] args) {
    int[] notAscendingList1 = { 3, 5, 2, 8, 9, 1 };
    int[] notAscendingList2 = { 1, 2, 3, 4, 4, 5 };
    int[] notAscendingList3 = { 1, 2, 3, 4, 5, 4 };
    int[] ascendingList1 = { 1, 2, 3, 4, 5 };

    System.out.println(isStrictAcending(notAscendingList1));
    System.out.println(isStrictAcending(notAscendingList2));
    System.out.println(isStrictAcending(notAscendingList3));
    System.out.println(isStrictAcending(ascendingList1));
  }
}
