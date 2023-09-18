package main;

//<문제> 금광
//금광의 모든 위치에 대하여 다음의 세 가지만 고려
//1. 왼쪽 위에서 오는 경우
//2. 왼쪽 아래에서 오는 경우
//3. 왼쪽에서 오는 경우

//array[i][j] = i행 j열에 존재하는 금의 양
//dp[i][j] = i행 j열까지의 최적의 해(얻을 수 있는 금의 최댓값)
//점화식
//dp[i][j] = array[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])

/*
테스트 케이스 입력
2
3 4
1 3 3 2 2 1 4 1 0 6 4 7

2
4 4
1 3 1 5 2 2 4 1 5 0 2 3 0 6 1 2
 */

import java.util.*;

public class Dynamic_5 {
	static int testCase, n, m;
	static int[][] arr = new int[20][20];
	static int[][] dp = new int[20][20];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스(Test Case) 입력
		testCase = sc.nextInt();
		for(int tc = 0; tc<testCase; tc++) {
			//금광 정보 입력
			n = sc.nextInt();
			m = sc.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			//다이나믹 프로그래밍을 위한 2차원 DP테이블 초기화
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					dp[i][j] = arr[i][j];
				}
			}
			//다이나믹 프로그래밍 진행
			//매 열을 확인하면서 이동
			for(int j=1; j<m; j++) {
				for(int i=0; i<n; i++) {
					int leftUp, leftDown, left;
					//왼쪽 위에서 오는 경우
					if(i == 0) leftUp = 0;
					else leftUp = dp[i-1][j-1];
					//왼쪽 아래에서 오는 경우
					if(i == n-1) leftDown = 0;
					else leftDown = dp[i+1][j-1];
					//왼쪽에서 오는 경우
					left = dp[i][j-1];
					dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(leftDown, left));
				}
			}
			int result = 0;
			for(int i=0; i<n; i++) {
				result = Math.max(result, dp[i][m-1]);
			}
			System.out.println(result);
		}
	}
}
