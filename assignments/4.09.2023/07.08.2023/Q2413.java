class Q2413 {
    public int smallestEvenMultiple(int n) {
        int ans;
        if(n%2==0){
             ans = n;
        }else{
             ans =  n*2;
        }
        return ans;
    }
}