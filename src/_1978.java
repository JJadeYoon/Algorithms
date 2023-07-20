import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 20.
 * 문제 : 소수 찾기
 * 코멘트 : 단항 연산자의 사용에 유의하자
 */
public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int primeNum = 0;

        int N;
        do {
            N = Integer.parseInt(br.readLine());
        } while (N > 100 || N < 0);

        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr);

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 1) continue;
            boolean isPrimeNum = true;
            int nTest = n - 1;
            while (nTest > 1) {
                if (n % nTest == 0){
                    isPrimeNum = false;
                    break;
                }
                nTest--;
            }
            if (isPrimeNum) primeNum++;
        }

        bw.write(primeNum + "" + "\n");
        bw.flush();
        bw.close();
    }
}
