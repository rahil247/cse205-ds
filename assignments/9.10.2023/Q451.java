import java.util.ArrayList;
import java.util.List;

public class Q451 {
    class Solution {
    public String frequencySort(String s) {
        // char[] s1 = s.toCharArray();
        // Arrays.sort(s1);
        
        // String s2 = new String(s1);
        // return s2;

        int[] counts = new int[128]; 

        for (char c : s.toCharArray()) {
            counts[c]++;
        }

        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }

        characters.sort((a, b) -> {
            if (counts[a] != counts[b]) {
                return counts[b] - counts[a];
            } else {
                return a - b;
            }
        });

        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            result.append(c);
        }

        return result.toString();
    }
}
}
