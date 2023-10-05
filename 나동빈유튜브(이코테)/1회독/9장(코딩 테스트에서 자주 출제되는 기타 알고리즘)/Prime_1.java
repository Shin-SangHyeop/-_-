package main;

//소수란 1보다 큰 자연수 중에서 1과 자기 자신을 제외한 자연수로는 나누어 떨어지지 않는 자연수
//6은 1,2,3,6 으로 나누어 떨어지므로 소수가 아님
//7은 1과 7을 제외하고는 나누어 떨어지지 않으므로 소수
//시간 복잡도 O(N)

public class Prime_1 {
	public static boolean isPrimeNumber(int x) {
		for(int i=2; i<x; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(7));
	}
}
