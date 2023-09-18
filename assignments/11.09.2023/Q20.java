import java.util.Stack;

public class Q20 {
    class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<Character>();

        for(char st : s.toCharArray()){
            if(st == '(' || st == '{' || st == '['){
              S.push(st);

            }else{
              if(S.isEmpty()){
                return false;
              }
              if(S.peek() == '(' && st == ')' || S.peek() == '{' && st == '}' || S.peek() == '[' && st == ']'){
                S.pop();
              }else{
                return false;
              }
            }
        }
        
        if(S.isEmpty()){
          return true;
        }else{
          return false;
        }
    }
}
}
