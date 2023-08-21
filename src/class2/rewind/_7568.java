package class2.rewind;

import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 20.
 * 문제 : 덩치
 * 코멘트 : 직접 비교 구현 생각하자
 */
public class _7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());

        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < n; i++) {

            int rank = 1;

            for (int j = 0; j < n; j++) {

                if (i == j) continue;

                if (data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
                    rank++;
                }
            }

            bw.write(rank +"" + " ");
        }
        bw.flush();
        bw.close();

    }
}

