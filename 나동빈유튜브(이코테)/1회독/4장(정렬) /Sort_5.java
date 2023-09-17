//<문제> 두 배열의 원소 교체
/* 내가 푼것 선택 정렬 시간 초과 판정 날 수 있음
public class Sort_5 {
    public static void main(String[] args){
        int[] A = {1, 2, 5, 4, 3};
        int[] B = {5, 5, 6, 6, 5};

        int min_idx = 0;
        int max_idx = 0;

        int k = 3;

        int sum=0;

        for(int a=0; a<k; a++){
            for(int i=0; i<A.length; i++){
                if(A[min_idx] > A[i]){
                    min_idx = i;
                }
            }

            for(int j=0; j<B.length; j++){
                if(B[max_idx] < B[j]){
                    max_idx = j;
                }
            }

            int temp = A[min_idx];
            A[min_idx] = B[max_idx];
            B[max_idx] = temp;
        }

        for(int i=0; i<A.length; i++){
            sum += A[i];
        }

        System.out.print(sum);
    }
}
*/

import java.util.*;

public class Sort_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N과 K를 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        //배열 A의 모든 원소를 입력받기
        Integer[] a = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        //배열 B의 모든 원소를 입력받기
        Integer[] b = new Integer[n];
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        //배열 A는 오름차순 정렬 수행
        Arrays.sort(a);
        //배열 A는 내림차순 정렬 수행
        Arrays.sort(b, Collections.reverseOrder());

        //첫 번째 인덱스부터 확인하며. 두 배열의 원소를 최대 k번 비교
        for(int i=0; i<k; i++){
            //A의 원소가 B의 원소보다 작은 경우
            if(a[i] < b[i]){
                //두 원소를 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            //A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }

        //배열 A의 모든 원소의 합을 출력
        long result = 0;
        for(int i=0; i<n; i++){
            result += a[i];
        }

        System.out.println(result);
    }
}
