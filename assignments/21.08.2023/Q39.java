import java.util.*;

class Q39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> com = new ArrayList<>();
        combinations(0, candidates, new ArrayList<>(),com, target);
        return com;
    }

    void combinations(int start,int[] nums, List<Integer> curr, List<List<Integer>> com, int target){
        
        if(target==0){
            com.add(new ArrayList<>(curr));
        }

        if(target<0){
            return;
        }
        

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            combinations(i, nums, curr,com, target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }
}
