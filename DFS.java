//나동빈 유튜브 음료수 얼려 먹기 (DFS 활용)
import java.util.*;
public class DFS {
    /*  혼자서 풀어보려 했으나 어떻게 해결해야 하는지 감이 오지 않아서 해답 봤음.
    코드 보면서 따라해보고 다시 복습하기.
    public static void main(String[] args){
        //4*5 얼음 틀
        int[][] ice = {{0,0,1,1,0}, {0,0,0,1,1}, {1,1,1,1,1}, {0,0,0,0,0}};
        int result = 0;

        dfs(ice);
    }

    public static int dfs(ice[][]){

        return 1;
    }
     */

    //나동빈씨 해답
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){

        // 주어진 범위를 벗어날 경우 즉시 종료.
        if(x <= -1 || x>=n || y <= -1 || y >=m){
            return false;
        }

        // 현재 노드를 방문 하지 않았다면
        if(graph[x][y] == 0){
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우 위치들도 모두 재귀적 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N, M 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        // 2차원 리스트의 맵 정보 입력 받기
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                //str에 담긴 문자를 하나씩 꺼내서 아스키 코드 값을 빼줘 정수형 값을 graph에 넣어줌
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        //모든 노드(위치)에 대하여 음료수 채우기
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //현재위치에서 DFS 수행
                if(dfs(i, j)){
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
