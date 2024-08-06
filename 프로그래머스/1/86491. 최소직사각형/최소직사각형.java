class Solution {
    public int solution(int[][] sizes) {
         int maxWidth = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            // 현재 명함의 가로와 세로를 비교하여 항상 큰 값이 가로, 작은 값이 세로가 되도록 정렬
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }
            
            // 최대 가로와 최대 세로 값을 갱신
            if (width > maxWidth) {
                maxWidth = width;
            }
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        
        // 지갑의 크기 계산
        return maxWidth * maxHeight;
    }
}