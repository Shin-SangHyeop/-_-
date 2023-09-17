//메모이제이션을 사용하여
//피보나치 수열을 수행할 경우
//시간 복잡도는 O(N)

package Dynamic;

import java.util.*;

public class Dynamic_2 {

    public static long[] d = new long[100];

    public static void main(String[] args){
        //첫 번째 피보나치 수와 두 번째 피보나치 수는 1
        d[1] = 1;
        d[2] = 1;
        int n = 50; // 50번째 피보나치 수를 계산

        //피보나치 함수(Fibonacci Function) 반복문으로 구현(보텀업 다이나믹 프로그래밍)
        for(int i=3; i<=n; i++){
            d[i] = d[i-1]+d[i-2];
        }
        System.out.println(d[n]);
    }
}
