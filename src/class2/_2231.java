package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 28.
 * 문제 : 분해합
 * 코멘트 :
 */
public class _2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < N; i++) {
            int num;
            int sum;
            num = sum = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
