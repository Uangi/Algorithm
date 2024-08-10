import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // Arrays.sort()로 배열을 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가진 학생이 체육복을 도난당한 학생과 겹치는 경우를 처리
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;  // 겹치는 경우는 여벌 체육복이 없어진 것으로 간주
                    lost[j] = -1;     // 도난당한 학생도 체육복을 잃어버린 것으로 간주
                    break;
                }
            }
        }
        
        // 여벌 체육복을 가진 학생이 체육복을 도난당한 학생에게 빌려주기
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) continue;  // 이미 처리된 여벌 체육복 학생은 건너뜀
            int res = reserve[i];
            if (findAndBorrow(lost, res - 1) || findAndBorrow(lost, res + 1)) {
                // 여벌 체육복을 빌려준 학생 제거
                reserve[i] = -1;
            }
        }
        
        // 체육수업에 참여할 수 있는 학생 수 계산
        int answer = n - lost.length;  // 총 학생 수에서 도난당한 학생 수를 뺌
        for (int i : lost) {
            if (i == -1) answer++;  // 체육복을 빌려받아 수업에 참여하는 학생 수 추가
        }
        
        return answer;
    }
    
    // 도난당한 학생 리스트에서 해당 번호의 학생이 체육복을 빌릴 수 있는지 확인하고, 빌려줌
    private boolean findAndBorrow(int[] lost, int student) {
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == student) {
                lost[i] = -1;  // 체육복을 빌려줌
                return true;
            }
        }
        return false;
    }
}
