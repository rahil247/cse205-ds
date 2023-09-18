import java.util.Stack;

public class Q844 {
    class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!s1.isEmpty() && c=='#') {
                s1.pop(); 
            }
            else{
                if(c!='#'){
                    s1.push(c);
                } 
            }
        }

        for(int i=0;i<t.length();i++)
        {
            char d = t.charAt(i);
            if(!s2.isEmpty() && d=='#'){
                s2.pop();
            } 
            else{
                if(d!='#'){
                    s2.push(d);  
                } 
            }
        }
        return s1.equals(s2);
    }
}
}
