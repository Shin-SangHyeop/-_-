package main;

import java.util.*;

//문제해결 아이디어 (가장 긴 증가하는 부분 수열 : LIS)
//<문제> 병사 배치하기 (가장 긴 감소하는 부분 수열을 구하는 문제이기 때문에 순서를 뒤집어야함)
//점화식
//D[i] = max(D[i], D[j] + 1) if array [j]< array[i]

/*
테스트 케이스 입력
7
15 11 4 8 5 2 4
 */

public class Dynamic_6 {
	static int n;
	static ArrayList<Integer> v = new ArrayList<Integer>();
	static int[] dp = new int[2000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			v.add(sc.nextInt());
		}
		//순서를 뒤집어 최장 증가 부분 수열 문제로 변환
		Collections.reverse(v);

		//다이나믹 프로그래밍을 위한 1차원 DP 테이블 초기화
		for(int i=0; i<n; i++) dp[i] = 1;
		//가장 긴 증가하는 부분 수열(LIS) 알고리즘 수행
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(v.get(j) < v.get(i)) dp[i] = Math.max(dp[i], dp[j]+1);
			}
		}
		//열외 해야하는 병사의 최소 수를 출력
		int maxValue = 0;
		for(int i=0; i<n; i++) maxValue = Math.max(maxValue, dp[i]);
		System.out.println(n-maxValue);
	}
}
