package main;

//동작방법
/*
1. 시작점(start)과 끝점(end)이 첫 번째 원소의 인덱스(0)를 가리키도록 한다.
2. 현재 부분 합이 M과 같다면, 카운트한다.
3. 현재 부분 합이 M보다 작다면, end를 1 증가시킨다.
4. 현재 부분 합이 M보다 크거나 같다면, start를 1 증가시킨다.
5. 모든 경우를 확인할 때까지 2번부터 4번까지의 과정을 반복한다.
 */

//시간 복잡도 O(N)

public class TwoPointer_1 {
	public static int n = 5; // 데이터의 개수 N
	public static int m = 5; // 찾고자 하는 부분합 M
	public static int[] arr = {1, 2, 3, 2, 5}; // 전체 수열

	public static void main(String[] args) {
		int cnt = 0, intervalSum = 0, end = 0;
		for(int start = 0; start < n; start++) {
			while(intervalSum < m && end < n) { //end를 가능한 만큼 이동시키기
				intervalSum += arr[end];
				end += 1;
			}

			if(intervalSum == m) { // 부분합이 m일 때 카운트 증가
				cnt += 1;
			}
			intervalSum -= arr[start];
		}
		System.out.println(cnt);
	}
}
