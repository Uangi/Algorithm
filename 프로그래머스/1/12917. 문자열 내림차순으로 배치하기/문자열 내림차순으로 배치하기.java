import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");
        Arrays.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(String List : list) sb.append(List);
        
        return sb.reverse().toString();
    }
}