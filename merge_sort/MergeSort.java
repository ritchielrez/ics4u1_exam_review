public class MergeSort {
  public static void mergeSort(int[] nums) {
    int low = 0, high = nums.length - 1, middle = (low + high) / 2;

    if (low < high) {
      mergeSort(nums, low, middle);
      mergeSort(nums, middle + 1, high);

      merge(nums, low, high);
    }
  }

  public static void mergeSort(int[] nums, int low, int high) {
    int middle = (low + high) / 2;

    if (low < high) {
      mergeSort(nums, low, middle);
      mergeSort(nums, middle + 1, high);

      merge(nums, low, high);
    }
  }

  public static void merge(int[] nums, int low, int high) {
    int middle = (low + high) / 2;

    int[] leftNums = new int[middle - low + 1];
    int[] rightNums = new int[high - middle];

    for (int i = 0; i < leftNums.length; i++) {
      leftNums[i] = nums[i + low];
    }
    for (int i = 0; i < rightNums.length; i++) {
      rightNums[i] = nums[i + middle + 1];
    }

    int leftI = 0, rightI = 0;

    for (int i = low; i <= high; i++) {
      if (leftI < leftNums.length && rightI < rightNums.length) {
        if(leftNums[leftI] < rightNums[rightI]) {
          nums[i] = leftNums[leftI];
          leftI++;
        } else {
          nums[i] = rightNums[rightI];
          rightI++;
        }
      } else if (leftI < leftNums.length) {
        nums[i] = leftNums[leftI];
        leftI++;
      } else if (rightI < rightNums.length) {
        nums[i] = rightNums[rightI];
        rightI++;
      }
    }
  }
}
