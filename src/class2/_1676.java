package class2;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 31.
 * 문제 : 팩토리얼 0의 개수
 * 코멘트 : 메모리 고려하기
 */
public class _1676 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int has2 = 0;
        int has5 = 0;

        while (n > 1) {
            int temp2 = n;
            while (temp2 % 2 == 0) {
                has2++;
                temp2 /= 2;
            }
            int temp5 = n;
            while (temp5 % 5 == 0) {
                has5++;
                temp5 /= 5;
            }
            n--;
        }

        int result = Math.min(has5, has2);
        System.out.println(result);
    }
}
