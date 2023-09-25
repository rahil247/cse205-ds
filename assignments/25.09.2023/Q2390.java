import java.util.Stack;

public class Q2390 {
    class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
           if(c=='*'){
            s1.pop();
           }
           else{
            s1.push(c);
           }
       }
       if(s1.isEmpty())
       {
          return "";
       }
       StringBuilder st = new StringBuilder();
       for(char c:s1){
           st.append(c);
       }
        return st.toString();
    }
}
}
