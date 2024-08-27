import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;

            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    int numerator = a * a + b * b + m;
                    int denominator = a * b;

                    if (numerator % denominator == 0) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
