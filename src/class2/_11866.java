package class2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8.13.
 * 문제 : 요세푸스 문제 0
 * 코멘트 : 큐로 푸는게 더 빠르다, 옳바른 자료구조를 고민해보자
 */
public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hashMap.put(i, true);
        }

        int removed = 0;
        int curr = 1;

        bw.write("<");
        while (removed < n) {

            int count = 0;
            while (count < k) {
                if (hashMap.get(curr)) {
                    count++;
                    if (count == k) break;
                }

                curr++;
                if (curr > n) {
                    curr = 1;
                }
            }
            hashMap.put(curr, false);
            bw.write(curr++ + "");
            if (curr > n) {
                curr = 1;
            }
            removed++;

            if (removed < n)
                bw.write(", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
