package class2.rewind;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 25.
 * 문제 : 소수 구하기
 * 코멘트 : 에라토스테네스의 채 구현
 */
public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        if (N == 1) return;
        if (M == 1) M++;

        boolean[] primeArr = new boolean[N + 1];
        for (int i = 2; i < N + 1; i++) {
            primeArr[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int i = M; i < N + 1; i++) {
            if (primeArr[i]) {
                bw.write(i + "" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
