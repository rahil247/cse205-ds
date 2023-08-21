import java.util.*;

public class Q90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsets(0,nums, new ArrayList<>(),result);
        return result;
    }

    void subsets(int idx, int[] nums, List<Integer> curr,  List<List<Integer>> result){
        result.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            subsets(i+1 , nums, curr, result );
            curr.remove(curr.size()-1);
        }
    }
}
