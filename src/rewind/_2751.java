package rewind;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 24.
 * 문제 : 수 정렬하기2
 * 코멘트 : 정렬 알고리즘을 정리하자 + 라이브러리 사용에 익숙해지자
 */
public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));
        br.close();

        Collections.sort(list);
        for (Integer i : list)
            bw.write(i + "" + "\n");
        bw.flush();
        bw.close();
    }
}
