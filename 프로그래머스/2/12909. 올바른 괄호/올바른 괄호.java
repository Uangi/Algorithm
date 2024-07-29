import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}