import java.util.Scanner;

public class Practice_DFS {
  public static int n,m;
  public static int[][] graph = new int[999][999];

  public static boolean dfs(int x,int y){
    //좌표값 범위 밖일시 바로 종료
    if(x <= -1 || x >=n || y<=-1||y>=m){
      return false;
    }

    //만약 노드 방문 하지 않았다면?
    if (graph[x][y] == 0){
      graph[x][y] = 1;  // 방문처리하고
      dfs(x-1,y); //위
      dfs(x,y-1); //왼쪽
      dfs(x+1,y); //아래쪽
      dfs(x,y+1); //오른쪽
      return true;
    }
    return false;
  }


  //메인 함수
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    sc.nextLine(); //  버퍼 지우기

    for( int i = 0 ; i < n ; i ++) {
      String str = sc.nextLine();
      for(int j = 0;j<m;j++){
        graph[i][j] = str.charAt(j);
      }
    }
    int result = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j<m; j++){
        if(dfs(i,j)){
          result += 1;
        }
      }
    }
  }
}

// 1. n,m 입력 받고 각각의 좌표에 입력받은 0,1 값 삽입
// 2. for문 두개로 0좌표 싹다 돌리기 첫방문 0 이면 result + 1