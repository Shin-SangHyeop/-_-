//선택 정렬 알고리즘 (가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸는 것을 반복)
//빅오표기법 O(N^2)
public class Sort_1 {
    public static void main(String[] args){
        int[] arr = {7, 5, 9, 0, 3, 1, 6 ,2 ,4, 8};

        for(int i=0; i<arr.length; i++){
            int min_idx = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            }

            //스와프
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
