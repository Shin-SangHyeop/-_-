import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] tempArr = String.valueOf(n).split("");
        String temp = "";
        
        Arrays.sort(tempArr, Collections.reverseOrder());
        
        for(int i=0; i<tempArr.length; i++){
            temp += tempArr[i];
        }
        
        answer = Long.valueOf(temp);
        
        return answer;
    }
}