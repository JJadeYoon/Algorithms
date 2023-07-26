package class2;

import java.io.*;
import java.util.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 26.
 * 문제 : 단어 정렬
 * 코멘트 : Comparator 사용하기
 */
public class _1181 {

    static Comparator<String> comp = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            } else {
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) == o2.charAt(i)) {
                        continue;
                    }
                    if (o1.charAt(i) - o2.charAt(i) < 0) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return 0;
            }
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<String> strList = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!strList.contains(str))
                strList.add(str);
        }
        br.close();

        strList.sort(comp);

        for (String s : strList) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
