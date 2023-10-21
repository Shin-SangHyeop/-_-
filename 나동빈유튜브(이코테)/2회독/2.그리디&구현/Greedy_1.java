import java.util.*;

public class Greedy_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {500, 100, 50, 10};
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            cnt += n / arr[i];
            n = n % arr[i];
        }

        System.out.print(cnt);
    }
}
