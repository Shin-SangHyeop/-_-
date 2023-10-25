import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<food.length; i++){
            map.put(String.valueOf(i),food[i]);
        }
        
        for(int i=1; i<map.size(); i++){
            if(map.get(String.valueOf(i)) != 1){
                if(sb == null){
                    if(map.get(String.valueOf(i)) % 2 == 0){
                        sb.append(String.valueOf(i).repeat(map.get(String.valueOf(i))));
                    }else{
                        sb.append(String.valueOf(i).repeat(map.get(String.valueOf(i)) / 2 + 1));
                    }
                }else{
                    if(map.get(String.valueOf(i)) % 2 == 0){
                        sb.insert(sb.length()/2, String.valueOf(i).repeat(map.get(String.valueOf(i))));
                    }else{
                        sb.insert(sb.length()/2,String.valueOf(i).repeat(map.get(String.valueOf(i)) - 1));
                    }
                }
            }
        }
        
        sb.insert(sb.length()/2,"0");
        answer = sb.toString();
        
        return answer;
    }
}