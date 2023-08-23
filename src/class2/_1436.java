package class2;

import java.util.Scanner;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 23.
 * 문제 : 영화감독 숌
 * 코멘트 :
 */
public class _1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 666;
        int nTh = 1;
        while (n != nTh) {
            num++;
            String strNum = Integer.toString(num);
            if (strNum.contains("666")) {
                nTh++;
            }
        }

        System.out.println(num);
    }
}