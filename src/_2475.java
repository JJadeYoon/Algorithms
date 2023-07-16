import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 16.
 * 문제 : 검증수
 * 코멘트 : BufferedWriter은 String형으로 바꿔주는 처리가 필요하다
 */
public class _2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr);
        int res = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            res += num * num;
        }
        res %= 10;

        bw.write(res+""+"\n");
        bw.flush();
        bw.close();
    }
}
