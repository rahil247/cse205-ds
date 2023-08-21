import java.util.*;

public class Q40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        com(0,candidates, new ArrayList<>(),res,target);
        return res;
    }

    void com(int start, int[] candidates, List<Integer> curr, List<List<Integer>> res, int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
        }

        for(int i = start; i< candidates.length; i++){
            if(i> start && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            com(i+1,candidates,curr,res,target-candidates[i]);
            curr.remove(curr.size()-1);
        }
    }
}
