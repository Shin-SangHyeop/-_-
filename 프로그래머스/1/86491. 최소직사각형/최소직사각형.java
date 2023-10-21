class Solution {
    public void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    
    public int solution(int[][] sizes) {
        int[] tempArr = new int[2];
        int maxA = 0;
        int maxB = 0;
        
        for(int i=0; i<sizes.length; i++){
            tempArr[0] = sizes[i][0];
            tempArr[1] = sizes[i][1];
                
            if(tempArr[0] < tempArr[1]){
                swap(tempArr);    
                sizes[i][0] = tempArr[0];
                sizes[i][1] = tempArr[1];
            }
            
            if(maxA < sizes[i][0]){
                maxA = sizes[i][0];
            }
            if(maxB < sizes[i][1]){
                maxB = sizes[i][1];
            }
        }
        
        int answer = maxA * maxB;
        
        return answer;
    }
}