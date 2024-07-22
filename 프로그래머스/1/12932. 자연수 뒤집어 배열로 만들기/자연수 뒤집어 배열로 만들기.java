class Solution {
    public int[] solution(long n) {
        
        int size = String.valueOf(n).length(); // n값을 문자열로 받아 해당 길이의 값을 정수형 변수에 대입
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = (int)(n % 10); 
            n /= 10; 
        }
        return answer;
    }
}