package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 2.
 * 문제 : 수 찾기
 * 코멘트 : 이분 탐색, Arrays 메서드 정리
 */
public class _1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(stN.nextToken());
        }
        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < M; i++) {
            bw.write(Arrays.binarySearch(arrN, Integer.parseInt(stM.nextToken())) >= 0 ? "1" + "\n" : "0" + "\n");
        }
        bw.flush();
        bw.close();
    }
}
