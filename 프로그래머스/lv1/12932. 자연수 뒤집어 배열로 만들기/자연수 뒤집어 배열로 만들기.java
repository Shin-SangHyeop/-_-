class Solution {
    public int[] solution(long n) {
        String[] temp = String.valueOf(n).split("");
        int[] answer = new int[temp.length];
        int idx = 0;
        
        for(int i=temp.length-1; i>=0; i--){
            answer[idx] = Integer.valueOf(temp[i]);
            idx++;
        }
        
        return answer;
    }
}