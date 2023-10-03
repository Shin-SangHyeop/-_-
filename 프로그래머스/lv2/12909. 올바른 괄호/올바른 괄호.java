import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> st = new Stack<>();
        if(s.charAt(0) == ')'){
            answer = false;
            return answer;
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        if(st.isEmpty()){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}