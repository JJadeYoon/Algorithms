package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 7.
 * 문제 : 카드2
 * 코멘트 :
 */
public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> cards = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            cards.add(N - i);
        }

        while (cards.size() > 1) {
            cards.removeLast();
            cards.addFirst(cards.getLast());
            cards.removeLast();
        }

        System.out.println(cards.get(0));
    }
}
