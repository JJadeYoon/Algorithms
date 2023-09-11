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

    /**
     * @author : JJadeYoon
     * @date : 2023. 8. 10.
     * 문제 : 균형잡힌 세상
     * 코멘트 :
     */
    public static class _4949 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while (true) {
                String str = br.readLine();
                if (str.equals(".")) {
                    break;
                }

                boolean isBalance = true;

                Stack<Character> stack = new Stack<>();

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (c == '(' || c == '[') {
                        stack.push(c);
                    }

                    if (c == ')') {
                        if (stack.isEmpty()) {
                            isBalance = false;
                            break;
                        }

                        if (stack.peek() != '(') {
                            isBalance = false;
                            break;
                        }
                        stack.pop();
                    }

                    if (c == ']') {
                        if (stack.isEmpty()) {
                            isBalance = false;
                            break;
                        }

                        if (stack.peek() != '[') {
                            isBalance = false;
                            break;
                        }
                        stack.pop();
                    }
                }

                if (!stack.isEmpty()) {
                    isBalance = false;
                }

                if (isBalance) {
                    bw.write("yes\n");
                } else {
                    bw.write("no\n");
                }
            }
            br.close();
            bw.flush();
            bw.close();
        }
    }
}

