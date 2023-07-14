import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 14.
 * 문제 : A/B
 * 코멘트 : 결과값으로부터 자료형을 생각하자
 */
public class _1008 {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);
        do {
            A = sc.nextInt();
        } while (A <= 0);

        do {
            B = sc.nextInt();
        } while (B >= 10);

        System.out.println((double) A / (double) B);
    }
}
