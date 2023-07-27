package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 27.
 * 문제 : 평균
 * 코멘트 : 컴퓨터의 계산을 수식으로 생각하려 하지 말자
 */
public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        arr[0] = Integer.parseInt(st.nextToken());

        int max = arr[0];
        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double modifiedSum = 0;
        for (int i = 0; i < N; i++) {
            modifiedSum += (double) arr[i] / max * 100;
        }

        double aver = modifiedSum / N;
        System.out.println(aver);
    }
}
