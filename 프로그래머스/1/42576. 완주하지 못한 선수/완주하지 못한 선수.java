import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i]; // 완주 실패자 반환
            }
        }
        return participant[completion.length];
    }
}

// 1. participant 요소와 completion의 요소 i 값에 맞춰 순회하며 비교

