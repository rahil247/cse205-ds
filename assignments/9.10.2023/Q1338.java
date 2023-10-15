import java.util.Arrays;

public class Q1338 {
    class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
    
    // Count the frequency of each integer
    int[] freq = new int[100001]; // As per the constraint, 1 <= arr[i] <= 105
    for (int num : arr) {
        freq[num]++;
    }
    
    // Sort the frequencies in descending order
    Arrays.sort(freq);
    
    int target = n / 2;
    int count = 0;
    int setSize = 0;
    
    // Iterate in reverse order to select the smallest set of integers
    for (int i = 100000; i >= 0; i--) {
        if (freq[i] == 0) {
            continue;
        }
        
        count += freq[i];
        setSize++;
        
        if (count >= target) {
            break;
        }
    }
    
    return setSize;
    }
}
}
