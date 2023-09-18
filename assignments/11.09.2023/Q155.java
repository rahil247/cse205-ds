import java.util.Stack;

public class Q155{
    class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> s = new Stack<>();
    public MinStack() {
        Stack<Integer> s = new Stack<>();
    }
    
    public void push(int val) {
        if(val<=min){
            s.push(min);
            min = val;
        }
        s.push(val);
    }
    
    public void pop() {
        if(s.pop() == min){
            min = s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
}