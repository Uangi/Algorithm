import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        
        int executionOrder = 0; // 프로세스가 몇 번째로 실행되는지 저장하는 변수
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;
            
            // 큐에 남아 있는 프로세스 중 더 높은 우선순위가 있는지 확인
            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            // 더 높은 우선순위의 프로세스가 있으면 다시 큐에 삽입
            if (hasHigherPriority) {
                queue.add(current);
            } else {
                // 실행 가능한 프로세스를 만난 경우
                executionOrder++;
                if (current[0] == location) {
                    return executionOrder;
                }
            }
        }
        
        return -1; // 이 코드에 도달하지 않습니다.
    }
}