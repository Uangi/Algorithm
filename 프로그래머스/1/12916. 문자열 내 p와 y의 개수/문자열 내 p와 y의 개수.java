class Solution {
    boolean solution(String s) {
        // if(s.matches(".*[a-zA-Z].*")) 
        // if(s.length()>50)
        String str = s.toUpperCase();
        int countP = 0;
        int countY = 0;
        
        for(char ch : str.toCharArray()) {    // 문자 배열로 반환 후 각 문자 순회
            if(ch == 'P') {
                countP++;
            } else if (ch == 'Y'){
                countY++;
            }
        }
        return countP == countY;
    }
}