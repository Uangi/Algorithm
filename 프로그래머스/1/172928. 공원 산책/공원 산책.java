class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] currentPos = new int[2];
        
        int height = park.length;
        int width = park[0].length();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') {
                    currentPos[0] = i;
                    currentPos[1] = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);
            int newY = currentPos[0];
            int newX = currentPos[1];
            boolean canMove = true;
            
            // 이동 방향에 따른 위치 계산
            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case "N":
                        newY--;
                        break;
                    case "S":
                        newY++;
                        break;
                    case "W":
                        newX--;
                        break;
                    case "E":
                        newX++;
                        break;
                }
                if (newY < 0 || newY >= height || newX < 0 || newX >= width) {
                    canMove = false;
                    break;
                }
                if (park[newY].charAt(newX) == 'X') {
                    canMove = false;
                    break;
                }
            }
            if (canMove) {
                currentPos[0] = newY;
                currentPos[1] = newX;
            }
        }
        return currentPos;
    }
}