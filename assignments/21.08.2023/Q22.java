import java.util.*;

public class Q22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        par("(", 1,0,res,n);
        return res;
    }

    void par(String curr, int op, int cp, List<String> res, int n){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }        
        if(op<n){
           par(curr + "(", op+1,cp,res,n); 
        }
        if(cp<op){
            par(curr + ")", op,cp+1,res,n);
        }
    }
}
