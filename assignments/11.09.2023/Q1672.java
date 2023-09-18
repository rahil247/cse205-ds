public class Q1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int[] acct : accounts) {
                int currWealth = 0;
                for (int money : acct) {
                    currWealth += money;
                }
                max = Math.max(max, currWealth);
            }
            return max;
        }
    }
}
