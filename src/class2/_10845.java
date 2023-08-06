package class2;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * @author : JJadeYoon
 * @date : 2023. 8. 6.
 * 문제 : 큐
 * 코멘트 :
 */
public class _10845 {

    public static class IntQue {
        private final Vector<Integer> v = new Vector<Integer>();

        private int start = 0;
        private int end = -1;
        private int capacity = 0;

        public void push(int X) {
            v.add(X);
            end++;
            capacity++;
        }

        public int pop() {
            if (capacity == 0) {
                return -1;
            }
            capacity--;
            return v.get(start++);
        }

        public int size() {
            return capacity;
        }

        public int empty() {
            return capacity == 0 ? 1 : 0;
        }

        public int front() {
            return capacity == 0 ? -1 : v.get(start);
        }

        public int back() {
            return capacity == 0 ? -1 : v.get(end);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        IntQue intQue = new IntQue();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    intQue.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    bw.write(intQue.pop() + "" + "\n");
                    break;

                case "size":
                    bw.write(intQue.size() + "" + "\n");
                    break;

                case "empty":
                    bw.write(intQue.empty() + "" + "\n");
                    break;

                case "front":
                    bw.write(intQue.front() + "" + "\n");
                    break;

                case "back":
                    bw.write(intQue.back() + "" + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
