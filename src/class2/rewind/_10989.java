package class2.rewind;

import java.io.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 1.
 * 문제 : 수 정렬하기 3
 * 코멘트 : 카운팅 정렬을 공부하자
 */
public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            for (int j = 0; j < arr[i]; j++) {
                bw.write(i + "" + "\n");
            }
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
