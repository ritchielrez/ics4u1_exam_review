public class Prog1 {
  public static void main(String[] args) {
    int[] nums1 = {5, 6, 6, 9, 11, 19, 28, 32};
    int match = 6;

    int index = BinarySearch.iterativeSearch(nums1, match);

    System.out.println(match + " is found in nums1 at " + index);
  }
}
