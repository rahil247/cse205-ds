import java.util.*;

public class Q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(0,nums, new ArrayList<>(),result);
        return result;
    }

    void subsets(int idx, int[] nums, List<Integer> curr,  List<List<Integer>> result){
        result.add(new ArrayList<>(curr)); //empty set initialised

        for (int i = idx; i < nums.length; i++) {
            curr.add(nums[i]);
            subsets(i+1 , nums, curr, result );
            curr.remove(curr.size()-1); //empty set made again
        }
    }
} 

