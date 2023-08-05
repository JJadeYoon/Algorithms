package class2.rewind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 6.
 * 문제 : 체스판 다시 칠하기
 * 코멘트 : 경우를 더 꼼꼼하게 생각하자
 */
public class _1018 {

    public static int count88Square(String[] str, char first, int x, int y) {

        int fix = 0;

        char currentColor = first;

        for (int i = y; i < y + 8; i++) {
            String currentLine = str[i].substring(x, x + 8);
            if (currentLine.charAt(0) != currentColor) {
                fix++;
            }

            for (int j = 1; j < 8; j++) {

                if (currentColor == currentLine.charAt(j)) {
                    currentColor = currentColor == 'B' ? 'W' : 'B';
                    fix++;
                    continue;
                }

                currentColor = currentLine.charAt(j);

            }
        }

        return fix;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> fix = new ArrayList<Integer>();

        String[] stringLine = new String[N];

        for (int i = 0; i < N; i++) {
            stringLine[i] = br.readLine();
        }
        br.close();

        for (int i = 0; 8 <= N - i; i++) {
            for (int j = 0; 8 <= M - j; j++) {

                /**
                * 8*8 검사
                * */
                fix.add(count88Square(stringLine, 'B', j, i));
                fix.add(count88Square(stringLine, 'W', j, i));
            }
        }

        Collections.sort(fix);
        System.out.println(fix.get(0));
    }
}
