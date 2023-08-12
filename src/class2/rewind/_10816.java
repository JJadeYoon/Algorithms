package class2.rewind;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 8.11.
 * 문제 : 숫자 카드 2
 * 코멘트 : HashMap 공부
 */
public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = parseInt(stN.nextToken());
            int value = 1;
            if (hashMap.containsKey(key)) {
                value = hashMap.get(key) + 1;
            }
            hashMap.put(key, value);
        }

        int m = parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());

        br.close();

        for (int i = 0; i < m; i++) {
            Integer write = hashMap.get(parseInt(stM.nextToken()));
            if (write == null) {
                write = 0;
            }
            bw.write(write + "" + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
