class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] temp = new int[n+1];
        
        temp[0] = 0;
        temp[1] = 1;
        
        for(int i=2; i<temp.length; i++){
            temp[i] = (temp[i-2] + temp[i-1]) % 1234567;
        }
        
        answer = temp[n] % 1234567;
        
        return answer;
    }
}