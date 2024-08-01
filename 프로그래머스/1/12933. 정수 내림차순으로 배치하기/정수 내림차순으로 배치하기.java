import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        String str = Long.toString(n);
        Character[] numbers = new Character[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            numbers[i] = str.charAt(i);                        
        }
        
        Arrays.sort(numbers, Collections.reverseOrder());
        
        StringBuilder sort = new StringBuilder();
        for(char num : numbers) {
            sort.append(num);
        }
        
        return Long.parseLong(sort.toString());
    }
}