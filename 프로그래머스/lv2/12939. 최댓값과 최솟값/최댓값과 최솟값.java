import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tempArr = s.split(" ");
        int max = Integer.valueOf(tempArr[0]);
        int min = Integer.valueOf(tempArr[0]);
        
        for(int i=0; i<tempArr.length; i++){
            max = Math.max(max, Integer.valueOf(tempArr[i]));
            min = Math.min(min, Integer.valueOf(tempArr[i]));
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}