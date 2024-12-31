class Solution {
    public static int solution(String s) {
        int length = s.length();
        int minLength = length; 
        
        // 단위 크기를 1부터 문자열 길이의 절반까지 증가시키며 시도
        for (int unit = 1; unit <= length / 2; unit++) {
            minLength = Math.min(minLength, compress(s, unit));
        }
        
        return minLength;
    }

    private static int compress(String s, int unit) {
        StringBuilder compressed = new StringBuilder();
        String prev = s.substring(0, unit); // 첫 번째 단위
        int count = 1; // 연속된 단위의 개수
        
        // 단위 크기만큼 반복하며 압축
        for (int i = unit; i < s.length(); i += unit) {
            int end = Math.min(i + unit, s.length()); // 마지막 단위 처리
            String current = s.substring(i, end);
            
            if (current.equals(prev)) {
                count++;
            } else {
                // 압축 결과에 추가
                if (count > 1) {
                    compressed.append(count);
                }
                compressed.append(prev);
                prev = current;
                count = 1;
            }
        }
        
        // 마지막 단위 처리
        if (count > 1) {
            compressed.append(count);
        }
        compressed.append(prev);
        
        return compressed.length();
    }
}