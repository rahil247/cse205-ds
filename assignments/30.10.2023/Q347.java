import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347 {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){ map.put(i, map.getOrDefault(i, 0) + 1); }
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){ maxheap.add(key); }
        
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = maxheap.poll();
        }
        
        return ans;
    }
}
}
