import java.util.*;

public class InsertionSort {
  // In this sorting algorithim, [0..i-1] is sorted and [i..end] is not. 
  // We try to shift the sorted part so we can insert values from unsorted part to sort the whole array.
  public static void iterativeSort(ArrayList<Integer> nums) {
    for (int i = 1; i < nums.size(); i++) {
      int key = nums.get(i);
      // We work backward from the key to find where it should be inserted.
      int j = i - 1;
      while (j >= 0 && nums.get(j) > key) {
        nums.set(j + 1,  nums.get(j));
        j--;
      }

      // j is where we found a number lower than key
      nums.set(j + 1, key);
    }
  }
}
