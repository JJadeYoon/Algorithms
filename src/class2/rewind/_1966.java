package class2.rewind;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 28.
 * 문제 : 프린터 큐
 * 코멘트 : 큐에 대해 더 공부하자. (큐를 만들기 위해 ArrayList를 사용하는 이유)
 */
public class _1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringTokenizer nums = new StringTokenizer(br.readLine());
            LinkedList<int[]> q = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                q.offer(new int[]{j, Integer.parseInt(nums.nextToken())});
            }

            int count = 0;

            while (!q.isEmpty()) {

                boolean isPrint = true;
                int[] first = q.poll();
                for (int j = 0; j < q.size(); j++) {
                    if (first[1] < q.get(j)[1]) {
                        q.offer(first);
                        isPrint = false;
                        break;
                    }
                }

                if (isPrint) {
                    count++;
                    if (first[0] == m) {
                        bw.write(count + "" + "\n");
                        break;
                    }
                }
            }

        }
        bw.flush();
        bw.close();

    }
}
