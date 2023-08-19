package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 19.
 * 문제 : 부녀회장이 될테야
 * 코멘트 :
 */
public class _2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            // 0층의 인원 배정
            for (int j = 0; j < n; j++) {
                arr[j] = j + 1;
            }

            // 1층부터 k - 1층의 인원 배정
            for (int j = 1; j < k; j++) {
                int[] temp = new int[n];

                // j층 l호까지 인원 계산
                for (int l = 0; l < n; l++) {
                    for (int m = 0; m <= l; m++) {
                        temp[l] += arr[m];
                    }
                }

                arr = temp.clone();
            }

            int result = Arrays.stream(arr).sum();
            System.out.println(result);
        }
    }
}
