import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 18.
 * 문제 : 음계
 * 코멘트 : 전 시행을 기록하는 좋은 방법은?
 */
public class _2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int num = Integer.parseInt(st.nextToken());
        int[] flag = new int[2];
        boolean isMixed = false;

        for (int i = 1; i < 8; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (num < temp) flag[0] = 1;
            else flag[1] = 1;
            if (flag[0] * flag[1] != 0) {
                isMixed = true;
                break;
            }
            num = temp;
        }

        if (isMixed) {
            bw.write("mixed" + "\n");
            bw.flush();
            bw.close();
            return;
        }
        if (flag[0] == 1) {
            bw.write("ascending" + "\n");
        } else {
            bw.write("descending" + "\n");
        }
        bw.flush();
        bw.close();
    }
}
