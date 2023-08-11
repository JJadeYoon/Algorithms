package class2.rewind;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 8.11.
 * 문제 : 숫자 카드 2
 * 코멘트 : 이분탐색을 직접 구현해보자
 */
public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayList.add(parseInt(stN.nextToken()));
        }
        Collections.sort(arrayList);

        int m = parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = 0;
            int finding = Integer.parseInt(stM.nextToken());

            int index = Collections.binarySearch(arrayList, finding);
            while (index >= 0) {
                num++;
                arrayList.remove(index);
                Collections.sort(arrayList);
                index = Collections.binarySearch(arrayList, finding);
            }
            bw.write(num + "" + " ");
        }
        br.close();
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
