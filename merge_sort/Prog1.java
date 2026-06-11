public class Prog1 {
  private static String intArrayListToString(int[] nums) {
    String result = "{";
    for (int num: nums) {
      result += num + ",";
    }
    // Remove last character, which is an additional comma in the end not needed.
    result = result.substring(0, result.length() - 1);
    result += "}";
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 5, 2, 0, 1};
    System.out.println("Before sorting (iterative): " + intArrayListToString(nums));
    MergeSort.mergeSort(nums);
    System.out.println("After sorting (iterative): " + intArrayListToString(nums));
  }
}
