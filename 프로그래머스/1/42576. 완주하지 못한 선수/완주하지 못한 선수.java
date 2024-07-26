import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hMap = new HashMap<>();
        
        // hMap 순회 후 default = 0 에서 + 1
        // 동명이인 발견 시 + 1
        for(String part : participant) {    // 참가자 저장
            hMap.put(part, hMap.getOrDefault(part , 0) + 1 );
        } 
        
        // hMap 순회 중 같은 key 발견 시 - 1
        // 참가자들 중에서 완주자와 같은 key 제거
        for(String comp : completion) {      
            hMap.put(comp, hMap.get(comp)- 1 );
        } 
        
        // hMap 순회 후 완주자의 key가 없다면 바로 반환
        for(String key : hMap.keySet()) { 
            if(hMap.get(key) > 0) {
                return key;
            }
        }
        return null;
    }
}

// 접근 1. participant Key 와 completion의 Key 값을 서로 순회하며 비교
