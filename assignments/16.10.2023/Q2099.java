import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2099 {
    class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         int n = nums.length;

        if(k == nums.length){
            return nums;
        }

        int[] temp = nums.clone();
        Arrays.sort(temp);
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = n - 1; i >= n - k; i--){
            count.put(temp[i], count.getOrDefault(temp[i], 0) + 1);
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(count.containsKey(nums[i])){
                int val = count.get(nums[i]);
                res[index++] = nums[i];
                if(val == 1){
                    count.remove(nums[i]);
                }
                else{
                    count.put(nums[i], --val);
                }
            }
        }

        return res;
    }
}
}
