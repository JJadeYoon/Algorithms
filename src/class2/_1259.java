package class2;

import java.io.*;
import java.util.Objects;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 18.
 * 문제 : 팰린드롬수
 * 코멘트 :
 */
public class _1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while (!Objects.equals(str, "0")) {
            int n = str.length();
            boolean isPalindrome = true;

            int i = 0;
            while (i < n / 2) {
                isPalindrome = str.charAt(i) == str.charAt(n - 1 - i);
                if (!isPalindrome) break;
                i++;
            }

            if (isPalindrome) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            bw.flush();

            str = br.readLine();
        }

        br.close();
        bw.close();
    }
}
