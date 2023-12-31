package class2.rewind;

import java.io.*;
import java.util.Stack;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 10.
 * 문제 : 균형잡힌 세상
 * 코멘트 :
 */
public class _4949 {

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
