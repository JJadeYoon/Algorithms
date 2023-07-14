import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 14.
 * 문제 : 사칙연산
 * 코멘트 : Scanner 말고 BufferedReader 사용 생각해보자
 */
public class _10869 {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);
        do {
            A = sc.nextInt();
        } while (A < 1);

        do {
            B = sc.nextInt();
        } while (B > 10000);

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
