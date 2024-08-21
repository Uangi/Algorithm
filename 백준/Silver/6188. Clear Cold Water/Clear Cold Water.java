import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 파이프의 총 개수
        int C = sc.nextInt(); // 연결의 개수
        
        // 인접 리스트 생성
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // 연결 정보 입력 받기
        for (int i = 0; i < C; i++) {
            int E = sc.nextInt();
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            
            adjList.get(E).add(B1);
            adjList.get(E).add(B2);
        }
        
        int[] distances = new int[N + 1];
        Arrays.fill(distances, -1); // 아직 방문하지 않은 노드로 설정
        distances[1] = 1; // 농장과 연결된 1번 파이프의 거리는 1로 설정
        
        // BFS로 거리 계산
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 1번 파이프부터 시작
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = distances[current];
            
            for (int next : adjList.get(current)) {
                if (distances[next] == -1) { // 아직 방문하지 않은 노드라면
                    distances[next] = currentDistance + 1;
                    queue.add(next);
                }
            }
        }
        
        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(distances[i]);
        }
    }
}
