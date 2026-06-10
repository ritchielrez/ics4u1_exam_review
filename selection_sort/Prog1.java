import java.util.ArrayList;
import java.util.List;

public class Prog1 {
  private static String intArrayListToString(ArrayList<Integer> nums) {
    String result = "{";
    for (Integer num: nums) {
      result += num + ",";
    }
    // Remove last character, which is an additional comma in the end not needed.
    result = result.substring(0, result.length() - 1);
    result += "}";
    return result;
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>(List.of(3, 5, 2, 0, 1));
    System.out.println("Before sorting (iterative): " + intArrayListToString(nums));

    SelectionSort.iterativeSort(nums);
    System.out.println("After sorting (iterative): " + intArrayListToString(nums));
  }
}
