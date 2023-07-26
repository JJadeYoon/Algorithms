package class1;

import java.util.Scanner;

public class _1001 {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);
        do {
            A = sc.nextInt();
        } while (A <= 0);

        do {
            B = sc.nextInt();
        } while (B >= 10);

        System.out.println(A - B);
    }
}
