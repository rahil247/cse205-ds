import java.util.*;

public class Q77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(1,n,new ArrayList<>(), result,k);
        return result;
    }
    void subsets(int start, int n ,List<Integer> curr ,List<List<Integer>> result,int k){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i<=n; i++){
            curr.add(i);
            subsets(i+1,n,curr, result,k);
            curr.remove(curr.size()-1);
        }
    }
}
