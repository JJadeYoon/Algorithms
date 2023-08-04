package class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 4.
 * 문제 : 나이순 정렬
 * 코멘트 :
 */
public class _10814 {
    public static void main(String[] args) throws IOException {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringTokenizer stO1 = new StringTokenizer(o1, " ");
                StringTokenizer stO2 = new StringTokenizer(o2, " ");
                return Integer.parseInt(stO1.nextToken()) - Integer.parseInt(stO2.nextToken());
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            arrayList.add(br.readLine());
        }
        br.close();

        arrayList.sort(comparator);

        for (String s : arrayList) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
