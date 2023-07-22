import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 22.
 * 문제 : 스택
 * 코멘트 : 문자열 값을 어떻게 메서드로 연결할 수 있을까
 */
public class _10828 {
    private static class IntStack {
        private int capacity;
        private int ptr;
        private int[] stk;

        public IntStack(int capacity) {
            this.capacity = ++capacity;
            stk = new int[++capacity];
            ptr = -1;
        }

        public int push(int X) {
            stk[++ptr] = X;
            return ptr;
        }

        public int pop() {
            if (ptr == -1) {
                System.out.println(ptr);
            } else {
                System.out.println(stk[ptr--]);
            }
            return ptr;
        }

        public void size() {
            System.out.println(ptr + 1);
        }

        public void empty() {
            if (ptr == -1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        public void top() {
            if (ptr == -1) {
                System.out.println(ptr);
            } else {
                System.out.println(stk[ptr]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        do {
            N = Integer.parseInt(br.readLine());
        } while (N > 10000 || N < 1);

        IntStack intStack = new IntStack(N);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    intStack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    intStack.pop();
                    break;
                case "size":
                    intStack.size();
                    break;
                case "empty":
                    intStack.empty();
                    break;
                case "top":
                    intStack.top();
                    break;
            }
        }
    }
}
