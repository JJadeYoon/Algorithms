package class2;

import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 8.12.
 * 문제 : 이항 계수 1
 * 코멘트 :
 */
public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 1;
        int i = k;
        while (i > 0) {
            result *= n--;
            i--;
        }

        while (k > 0) {
            result /= k--;
        }

        System.out.println(result);
    }
}
