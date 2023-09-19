class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tempArr = s.split(" ");
        String last = s.substring(s.length()-1,s.length());
        
        for(int i=0; i<tempArr.length; i++){
            if(!tempArr[i].equals("")){
                answer+= tempArr[i].substring(0,1).toUpperCase() +
                        tempArr[i].substring(1,tempArr[i].length()).toLowerCase() + " ";
            }else{
                answer += " ";
            }
        }
        
        if(!last.equals(" ")){
            answer = answer.substring(0,answer.length()-1);
        }
        
        return answer;
    }
}