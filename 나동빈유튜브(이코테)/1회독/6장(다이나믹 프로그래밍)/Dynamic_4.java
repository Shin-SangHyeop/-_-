package main;

import java.util.*;
//<문제> 효율적인 화폐 구성

//점화식
//a(i-k)를 만드는 방법이 존재하는 경우, a(i) = min(a(i),a(i-k)+1)
//a(i-k)를 만드는 방법이 존재하지 않는 경우, a(i) = INF(무한)
//INF는 특정 금액을 만들 수 있는 화폐 구성이 가능하지 않다는 의미
//최대 화폐 합이 10000이므로 INF는 10001로 설정 가능

public class Dynamic_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		//N개의 화폐 단위 정보를 입력받기
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] d = new int[m+1]; //DP 테이블 초기화
		//d의 테이블의 각 인덱스의 값들을 10001로 초기화
		Arrays.fill(d, 10001);
		// 다이나믹 프로그래밍 진행 (보텀업)
		d[0] = 0;
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<=m; j++) {
				//(i-k)원을 만드는 방법이 존재하는 경우
				if(d[j-arr[i]] != 10001) {
					d[j] = Math.min(d[j], d[j - arr[i]] + 1);
				}
			}
		}

		if(d[m] == 10001) System.out.println(-1);
		else System.out.println(d[m]);

	}
}
