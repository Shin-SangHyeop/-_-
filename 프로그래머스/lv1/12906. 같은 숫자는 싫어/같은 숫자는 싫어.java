import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else{
                if(st.peek() != arr[i]){
                    st.push(arr[i]);
                }
            }
        }
        
        answer = new int[st.size()];
        
        for(int i=0; i<st.size(); i++){
            answer[i] = st.get(i);
        }

        return answer;
    }
}