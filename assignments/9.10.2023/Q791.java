public class Q791 {
    class Solution {
        public String customSortString(String order, String s) {
            // Create an array to count the frequency of characters in s.
            int[] charCount = new int[26];
    
            // Count the frequency of characters in s.
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }
    
            StringBuilder result = new StringBuilder();
    
            // Append characters from order to the result string in the order specified by 'order'.
            for (char c : order.toCharArray()) {
                while (charCount[c - 'a'] > 0) {
                    result.append(c);
                    charCount[c - 'a']--;
                }
            }
    
            // Append any remaining characters from s that are not in order.
            for (char c = 'a'; c <= 'z'; c++) {
                while (charCount[c - 'a'] > 0) {
                    result.append(c);
                    charCount[c - 'a']--;
                }
            }
    
            return result.toString();
        }
    }
}
