public class Q2706 {
    class Solution {
        public int buyChoco(int[] prices, int money) {
            // Arrays.sort(prices);
            quickSort(prices,0,prices.length-1);
            if(prices[0]+prices[1]>money){
                return money;
            }else{
                return (money - (prices[0]+prices[1]));
            }
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
