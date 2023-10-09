public class Q169 {
    class Solution {
        public int majorityElement(int[] nums) {
            // Arrays.sort(nums);
            quickSort(nums, 0, nums.length - 1);
            return nums[nums.length/2];
        }
            public static void quickSort(int[] nums, int low, int high) {
            if (low < high) {
                int partitionIndex = partition(nums, low, high);
                quickSort(nums, low, partitionIndex - 1);
                quickSort(nums, partitionIndex + 1, high);
            }
        }
    
        public static int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            int i = (low - 1);
    
            for (int j = low; j < high; j++) {
                if (nums[j] <= pivot) {
                    i++;
                    swap(nums, i, j);
                }
            }
    
            swap(nums, i + 1, high);
            return i + 1;
        }
    
        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    
}
