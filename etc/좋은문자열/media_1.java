import java.util.*;
public class media_1 {
    public static void main(String[] args) {
        //커맨드에서 문자를 입력받는다.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(int i=0; i<a.length(); i++){
            set2.add(a.charAt(i)+"");
        }

        List<String> list = new ArrayList<>(set2);

        int idx = 0;
        while (idx<a.length()){
            int end = idx + 1;
            for(int i=0; i<a.length(); i++){
                int sum = 0;
                if(end <= a.length()){
                    String[] tempArr = a.substring(i,end).split("");
                    int[] cntArr = new int[list.size()];
                    for(int j=0; j<tempArr.length; j++){
                        for(int k=0; k<list.size(); k++){
                            if(tempArr[j].equals(list.get(k))){
                                cntArr[k]++;
                            }
                        }
                    }
                    for(int j=0; j<cntArr.length; j++){
                        if(cntArr[j] > 1){
                            sum = -1;
                        }
                    }

                    if(sum == -1){
                        continue;
                    }

                    set.add(a.substring(i,end));
                    end++;
                    continue;
                }else{
                    break;
                }
            }
            idx++;
        }

        System.out.println(set);
        //결과(result)는 set의 사이즈
        System.out.print(set.size());
    }
}