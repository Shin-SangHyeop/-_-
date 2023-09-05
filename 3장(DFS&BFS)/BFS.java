import java.util.*;

class Node {
    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

//BFS 활용
public class BFS {
    //내가 풀어본것.
    //최단 거리를 어떻게 구해야하는지를 모르겠..
    //나중에 다시 풀어보기
/*
    public static int n, m;
    public static int[][] graph = new int[200][200];

    public static boolean BFS(int x, int y){
        //괴물을 만났다면 도망 가야지
        if(graph[x][y] == 0){
            return false;
        }

        //미로 범위 밖으로 벗어나면 종료
        if(x < 0 || x > n || y < 0 || y > m){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        int result = 0;

        //2차원 배열 매핑
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                //str 문자열에 아스키 코드를 빼서 정수형 데이터를 넣어줌
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // 잘가고있다면 +1
                if(BFS(i,j) == true){
                    result +=1;
                }
            }
        }

        System.out.println(result);

    }
 */

    //BFS는 큐를 사용해야하는구나..
    //아래부터는 나동빈씨 해답
    public static int n,m;
    public static int[][] graph = new int[201][201];

    // 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y){
        //큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<Node> q= new LinkedList<>();
        q.offer(new Node(x,y));
        while (!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //미로 찾기 공간을 벗어난 경우 무시
                if(nx < 0 || nx >= n || ny <0 || ny >= m) continue;

                //벽인 경우 무시
                if(graph[nx][ny] == 0) continue;

                if(graph[nx][ny] == 1){
                    graph[nx][ny] = graph[x][y] + 1;
                    //ystem.out.println(graph[nx][ny]);
                    q.offer(new Node(nx,ny));
                }
            }
        }

        return graph[n - 1][m - 1];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //n, m을 공백 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        //2차원 리스트의 맵 정보 입력받기
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        //BFS를 수행한 결과 출력
        System.out.println(bfs(0,0));
    }
}

//어렵다..
//Node Class 구현 하는 부분 생각하지도 못함
//다음에 꼭 다시 풀어보기