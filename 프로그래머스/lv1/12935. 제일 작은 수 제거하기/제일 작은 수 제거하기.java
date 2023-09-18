import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        int idx = -1;
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
        }
        
        list.remove(idx);
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}