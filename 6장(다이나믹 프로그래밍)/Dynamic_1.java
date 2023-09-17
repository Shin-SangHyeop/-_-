//재귀함수를 이용하여 피보나치를 풀 경우
//O(2^n)
//fibo(30)을 계산하기 위해 약 10억 가량의 연산이 수행되어야함

package Dynamic;

public class Dynamic_1 {
    public static int fibo(int n){

        if(n <= 2){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args){
        System.out.print(fibo(4));
    }
}
