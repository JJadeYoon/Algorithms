import java.io.*;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 19.
 * 문제 : 설탕 배달
 * 코멘트 : 좀 더 간단하게 할 수 없을까?
 */
public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        do {
            N = Integer.parseInt(br.readLine());
        } while (N < 3 || N > 5000);

        int bagNum = -1;
        int largeBag = N / 5;
        int smallBag = 0;
        while (largeBag >= 0) {
            int rest = N - largeBag * 5;
            if (rest % 3 == 0) smallBag = rest / 3;
            if (largeBag * 5 + smallBag * 3 == N) {
                bagNum = largeBag + smallBag;
                break;
            }
            largeBag--;
        }

        bw.write(String.valueOf(bagNum));
        bw.flush();
        bw.close();
    }
}
