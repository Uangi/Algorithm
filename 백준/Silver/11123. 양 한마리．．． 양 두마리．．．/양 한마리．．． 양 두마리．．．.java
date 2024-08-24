import java.util.Scanner;

class Main {
    
    static int H, W;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 테스트 케이스 수
        scanner.nextLine();  // 개행 문자 처리

        for (int t = 0; t < T; t++) {
            H = scanner.nextInt();
            W = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 처리

            grid = new char[H][W];
            visited = new boolean[H][W];
            
            for (int i = 0; i < H; i++) {
                grid[i] = scanner.nextLine().toCharArray();
            }
            
            int groupCount = 0;

            // 모든 셀을 확인하여 양무리를 찾음
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (grid[i][j] == '#' && !visited[i][j]) {
                        dfs(i, j);
                        groupCount++;
                    }
                }
            }

            System.out.println(groupCount);
        }

        scanner.close();
    }

    // 깊이 우선 탐색 (DFS) 함수
    static void dfs(int x, int y) {
        if (x < 0 || x >= H || y < 0 || y >= W || grid[x][y] == '.' || visited[x][y]) {
            return;
        }
        
        visited[x][y] = true;

        // 상하좌우로 탐색
        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }
}
