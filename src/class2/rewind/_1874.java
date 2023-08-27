package class2.rewind;

import java.io.*;
import java.util.Stack;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 27.
 * 문제 : 스택 수열
 * 코멘트 : 메모리 초과 고려 (String의 불변성), 문제 조건 생각
 */
public class _1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        boolean isAble = true;
        int count = 0;
        int start = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(start++);
        sb.append("+\n");

        while (count < n) {
            if (!stack.isEmpty() && stack.peek() == arr[count]) {
                stack.pop();
                sb.append("-\n");
                count++;
            } else {
                if (start > n) {
                    isAble = false;
                    break;
                }
                stack.push(start++);
                sb.append("+\n");
            }
        }

        if (!isAble) {
            bw.write("NO\n");
        } else {
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();

    }
}
