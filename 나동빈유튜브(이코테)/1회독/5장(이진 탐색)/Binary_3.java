//<문제> 정렬된 배열에서 특정 수의 개수 구하기
//시간 복잡도 O(logN)으로 동작하도록 요구하는 문제
//선형 탐색으로는 시간 초과 판정
//이진 탐색을 수행해야함

import java.util.*;
public class Binary_3 {

    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        // **유의: lowerBound와 upperBound는 end 변수의 값을 배열의 길이로 설정**
        int rightIndex = upperBound(arr, rightValue, 0, arr.length);
        int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
        return rightIndex - leftIndex;
    }

    public static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = countByRange(arr, x, x);

        if(count == 0) System.out.print(-1);
        else System.out.print(count);
    }
}
