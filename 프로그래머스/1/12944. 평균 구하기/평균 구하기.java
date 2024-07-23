class Solution {
    public double solution(int[] arr) {
        
        double answer = 0;
        int sum = 0;
        int sol = arr.length;
        for(int num : arr) {
            sum += num;
        }
        return (double)sum / sol;
    }
}