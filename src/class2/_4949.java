package class2;

import java.io.*;

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

            while (str.indexOf('(') > 0 || str.indexOf('[') > 0) {

                int small = str.indexOf('(');
                if (small > str.indexOf(')')) {
                    isBalance = false;
                    break;
                }

                int big = str.indexOf('[');
                if (big > str.indexOf(']')) {
                    isBalance = false;
                    break;
                }

                if (small < big) {
                    str = str.substring(small + 1, str.lastIndexOf(')'));
                } else {
                    str = str.substring(big + 1, str.lastIndexOf(']'));
                }

                System.out.println("str = " + str);
            }

            if (isBalance) {
                bw.write("yes\n");
                System.out.println('y');
            } else {
                bw.write("no\n");
                System.out.println('n');
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
