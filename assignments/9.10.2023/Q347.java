import java.util.Arrays;

public class Q347 {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        
        // Create arrays to store unique elements and their frequencies.
        int[] unique = new int[n];
        int[] frequency = new int[n];
        
        int uniqueCount = 0;

        // Initialize variables to track the current element and its count.
        int currentElement = nums[0];
        int currentCount = 1;

        // Iterate through the sorted array and count the frequency of each element.
        for (int i = 1; i < n; i++) {
            if (nums[i] == currentElement) {
                currentCount++;
            } else {
                unique[uniqueCount] = currentElement;
                frequency[uniqueCount] = currentCount;
                uniqueCount++;
                currentElement = nums[i];
                currentCount = 1;
            }
        }

        // Append the final element and its count.
        unique[uniqueCount] = currentElement;
        frequency[uniqueCount] = currentCount;
        uniqueCount++;

        // Sort the unique elements based on their frequencies in descending order.
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (frequency[i] < frequency[j]) {
                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;
                    int tempElement = unique[i];
                    unique[i] = unique[j];
                    unique[j] = tempElement;
                }
            }
        }

        // Create a result array and add the k most frequent elements to it.
        int[] result = new int[k];
        System.arraycopy(unique, 0, result, 0, k);
        
        return result;
    }
}

}
