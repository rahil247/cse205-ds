import java.util.Arrays;

public class Q215 {
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k]; 
    }
}
}
