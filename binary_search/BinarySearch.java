public class BinarySearch {
  // Returns the index in the array the match is found. Otherwise
  // if the match is not found then returns -1.
  public static int iterativeSearch(int[] nums, int match) {
    int low = 0, high = nums.length - 1, mid;

    while(low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] > match) high = mid - 1;
      else if (nums[mid] < match) low = mid + 1;
      else return mid;
    }

    return -1;
  }

  public static int recursiveSearch(int []nums, int match) {
    int low = 0, high = nums.length - 1, mid;

    while(low <= high) {
      mid = (low + high) / 2;
      if (nums[mid] > match) {
        high = mid - 1;
        return recursiveSearch(nums, match, low, high);
      }
      else if (nums[mid] < match) {
        low = mid + 1;
        return recursiveSearch(nums, match, low, high);
      } else return mid;
    }

    return -1;
  }

  public static int recursiveSearch(int []nums, int match, int low, int high) {
    while(low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] > match) {
        high = mid - 1;
        return recursiveSearch(nums, match, low, high);
      }
      else if (nums[mid] < match) {
        low = mid + 1;
        return recursiveSearch(nums, match, low, high);
      } else return mid;
    }

    return -1;
  }
}
