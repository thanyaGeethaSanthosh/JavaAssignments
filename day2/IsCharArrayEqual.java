public class IsCharArrayEqual {

  public static boolean isCharArrayEqual(char[] charList1, char[] charList2) {
    int index = 0;
    boolean equal = charList1.length == charList2.length;

    while (index < charList1.length && equal) {
      equal = charList1[index] == charList2[index];
      index++;
    }
    return equal;
  }

  public static void main(String[] args) {
    char[] list1 = { 'a', 'b', 'c' };
    char[] list2 = { 'a', 'b', 'c' };
    char[] list3 = { 'a', 'b', 'd' };
    char[] list4 = { 'a', 'b', 'c', 'd' };

    System.out.println(isCharArrayEqual(list1, list2));
    System.out.println(isCharArrayEqual(list1, list3));
    System.out.println(isCharArrayEqual(list1, list4));
  }
}
