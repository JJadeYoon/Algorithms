import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 16.
 * 문제 : A + B
 * 코멘트 :
 */
public class _1000 {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);
        do {
            A = sc.nextInt();
        } while (A <= 0);

        do {
            B = sc.nextInt();
        } while (B >= 10);

        System.out.println(A + B);
    }
}
