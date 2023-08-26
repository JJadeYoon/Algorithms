package class2.rewind;

import java.io.*;
import java.util.Stack;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 27.
 * 문제 : 스택 수열
 * 코멘트 : Stack 라이브러리 없이 구현?
 */
public class _1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int bigIndex = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
            if (input == n) {
                bigIndex = i;
            }
        }
        br.close();

        boolean isPossible = true;
        for (int i = bigIndex + 1; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isPossible = false;
                break;
            }
        }

        if (!isPossible) {
            bw.write("NO\n");
        } else {
            StringBuilder sb = new StringBuilder();
            Stack<Integer> intStack = new Stack<>();
            int start = 1;
            int count = 0;

            while (count < n) {
                if (intStack.isEmpty()) {
                    sb.append("+\n");
                    intStack.push(start++);
                    continue;
                }

                if (arr[count] == intStack.peek()) {
                    sb.append("-\n");
                    intStack.pop();
                    count++;
                } else {
                    sb.append("+\n");
                    intStack.push(start++);
                }
            }

            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();

    }
}
