package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 8.
 * 문제 : 직각삼각형
 * 코멘트 :
 */
public class _4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            String s = br.readLine();
            if (s.equals("0 0 0")) break;

            StringTokenizer st = new StringTokenizer(s);
            int[] triangle = new int[3];

            for (int i = 0; i < 3; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(triangle);

            int left = triangle[0] * triangle[0] + triangle[1] * triangle[1];
            int right = triangle[2] * triangle[2];

            boolean isRight = left == right;

            if (isRight) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
