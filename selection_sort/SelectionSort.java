import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
  public static void iterativeSort(ArrayList<Integer> nums) {
    for (int i = 0; i < nums.size() - 1; i++) {
      // Assume that the element at i is the lowest number in the set or subset.
      int minIndex = i;
      for (int j = i + 1; j < nums.size(); j++) {
        // Found a number that is lower than your assumed lowest number.
        if (nums.get(j) < nums.get(minIndex)) {
          // Set the minIndex based on the newly found lowest number;
          minIndex = j;
        }
      }

      // Swap the element at i with the element at minIndex.
      Collections.swap(nums, i, minIndex);
    }
  }
}
