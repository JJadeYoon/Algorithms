import java.io.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 15.
 * 문제 : 문자와 문자열
 * 코멘트 : String 함수들을 정리해보자
 */
public class _27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i;
        do {
            i = Integer.parseInt(br.readLine());
        } while (i > s.length() || i < 1);
        bw.write(s.charAt(i - 1));
        bw.flush();
        bw.close();
    }
}
