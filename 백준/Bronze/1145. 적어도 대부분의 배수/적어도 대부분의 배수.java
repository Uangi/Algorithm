import java.util.*;

public class Main {

    // 주어진 숫자들로부터 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int minLcm = Integer.MAX_VALUE;

        // 3개의 수를 선택하는 모든 조합에 대해 최소공배수를 계산
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int lcmValue = lcm(numbers[i], lcm(numbers[j], numbers[k]));
                    if (lcmValue < minLcm) {
                        minLcm = lcmValue;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(minLcm);
    }
}
