package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 23.
 * 문제 : 블랙잭
 * 코멘트 : 모든 시행을 비교해야만 알 수 있는걸까?
 */
public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NM = br.readLine();
        StringTokenizer st = new StringTokenizer(NM);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cardArr = new int[N];
        for (int i = 0; i < N; i++) {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        int gap = M;
        for (int i = 0; i < N; i++) {
            if (cardArr[i] > M)
                continue;
            for (int j = i + 1; j < N; j++) {
                if (cardArr[i] + cardArr[j] > M)
                    continue;
                for (int k = j + 1; k < N; k++) {
                    int sumOf3 = cardArr[i] + cardArr[j] + cardArr[k];

                    if (sumOf3 > M)
                        continue;

                    int temp = M - sumOf3;
                    temp = temp > 0 ? temp : -temp;

                    if (gap > temp)
                        gap = temp;
                }
            }
        }

        System.out.println(M - gap);
    }
}
