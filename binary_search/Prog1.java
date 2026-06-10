public class Prog1 {
  public static void main(String[] args) {
    int[] nums1 = {5, 6, 6, 9, 11, 19, 28, 32};
    int match = 9;

    int index1 = BinarySearch.iterativeSearch(nums1, match);
    int index2 = BinarySearch.recursiveSearch(nums1, match);

    if (index1 != -1) {
      System.out.println(match + " is found (using iterative approach) in nums1 at " + index1);
    } else {
      System.out.println(match + " is not found (using iterative approach) in nums1");
    }

    if (index2 != -1) {
      System.out.println(match + " is found (using recursive approach) in nums1 at " + index2);
    } else {
      System.out.println(match + " is not found (using recursive approach) in nums1");
    }
  }
}
