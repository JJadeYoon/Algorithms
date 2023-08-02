package class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 2.
 * 문제 : 좌표 정렬하기
 * 코멘트 : 이차원 배열 정렬하기
 */
public class _11650 {
    public static void main(String[] args) throws IOException {

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(arr, comparator);

        for (int i = 0; i < N; i++) {
            bw.write(arr[i][0] + "" + " ");
            bw.write(arr[i][1] + "");
            bw.write( "\n");
        }
        bw.flush();
        bw.close();
    }
}
