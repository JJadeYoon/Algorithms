package class2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 29.
 * 문제 : 최대공약수와 최소공배수
 * 코멘트 :
 */
public class _2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int smallNum = Integer.parseInt(st.nextToken());
        int bigNum = Integer.parseInt(st.nextToken());
        br.close();

        if (smallNum > bigNum) {
            int temp = smallNum;
            smallNum = bigNum;
            bigNum = temp;
        }

        int commDivisor = 1;
        for (int i = 2; i <= smallNum; i++) {
            if (bigNum % i == 0 && smallNum % i == 0) {
                commDivisor = i;
            }
        }

        int commMulti = bigNum;
        for (int i = 1; commMulti <= bigNum * smallNum; i++) {
            if ((bigNum * i) % smallNum == 0) {
                commMulti = bigNum * i;
                break;
            }
        }

        bw.write(commDivisor + "" + "\n");
        bw.write(commMulti + "" + "\n");
        bw.flush();
        bw.close();
    }
}
