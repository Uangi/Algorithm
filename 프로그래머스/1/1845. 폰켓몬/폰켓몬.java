import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {

    // HashMap으로 value값이 이전 요소에 포함됐는지  
        HashSet<Integer> hMap = new HashSet<>();
        
        for(int Ponketmon : nums) {
            hMap.add(Ponketmon);
        }
        
        // 최대로 선택할 수 있는 종류 수
        int maxSize = nums.length / 2;
        
        return Math.min(hMap.size(), maxSize);
    }
}

