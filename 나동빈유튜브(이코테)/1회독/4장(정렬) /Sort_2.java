//삽입 정렬 (처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입)
//시간 복잡도 O(N^2)
//리스트의 데이터가 거의 정렬되어 있는 상태라면
//O(N)
public class Sort_2 {
    public static void main(String[] args){
        int[] arr = {7, 5, 9, 0, 3, 1, 6 ,2 ,4, 8};

        for(int i=1; i<arr.length; i++){
            // 인덱스 i부터 1까지 감소하며 반복하는 문법
            for(int j=i; j>0; j--){
                //한칸씩 왼쪽으로 이동
                if(arr[j] < arr[j-1]){
                    //스와프
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
