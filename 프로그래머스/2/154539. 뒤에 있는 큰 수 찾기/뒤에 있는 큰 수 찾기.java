import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        // 결과를 담을 배열을 -1로 초기화
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
        }

        // 스택에는 아직 뒷 큰수를 찾지 못한 인덱스를 저장
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            // 스택의 마지막 값이 현재 숫자보다 작으면 뒷 큰수를 현재 숫자로 갱신
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }

            // 현재 인덱스를 스택에 추가
            stack.push(i);
        }

        return answer;
    }

}