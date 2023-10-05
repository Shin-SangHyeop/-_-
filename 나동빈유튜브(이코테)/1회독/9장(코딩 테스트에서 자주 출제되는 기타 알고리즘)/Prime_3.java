package main;

import java.util.*;

//에라토스테네스의 체
//다수의 자연수에 대하여 소수 여부를 판별할 때 사용하는 대표적인 알고리즘
//에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾을 때 사용

//에라토스테네스의 체 동작과정
/*
 1. 2부터 N까지의 모든 자연수를 나열
 2. 남은 수 중에서 아직 처리하지 않은 가장 작은 수 i를 찾는다.
 3. 남은 수 중에서 i의 배수를 모두 제거한다. (i는 제거하지 않는다.)
 4. 더 이상 반복할 수 없을 때까지 2번과 3번의 과정을 반복한다.
 */

//시간복잡도 O(NloglogN)

public class Prime_3 {

	public static int n = 1000; // 2부터 1000까지의 모든 수에 대하여 소수 판별
	public static boolean[] arr = new boolean[n+1];

	public static void main(String[] args) {
		Arrays.fill(arr, true); //처음엔 모든 수가 소수(True)인 것으로 초기화(0과 1은 제외)
		for(int i=2; i<=Math.sqrt(n); i++) {// 2부터 n의 제곱근까지의 모든 수를 확인하며
			if(arr[i] == true) { // i가 소수인 경우(남은 수인 경우)
				//i를 제외한 i의 모든 배수를 지우기
				int j=2;
				while(i*j <= n) {
					arr[i*j] = false;
					j += 1;
				}
			}
		}

		for(int i=2; i<=n; i++) {//모든 소수 출력
			if(arr[i]) System.out.print(i+" ");
		}
	}
}
