import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(!stack.empty()){
                if(stack.peek()!=arr[i]) //마지막 인덱스와 다르면
                    stack.push(arr[i]);
            }
            else
                stack.push(arr[i]);
        }
        int answer[]=new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--)
            answer[i] = stack.pop();
		//스택은 pop하면 선입후출이므로 역순서로 배열에 넣는다.
        return answer;
    }
}