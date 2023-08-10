    package class2.rewind;

    import java.io.*;
    import java.util.StringTokenizer;

    /**
     * @author : JJadeYoon
     * @date : 2023. 8. 10.
     * 문제 : 덱
     * 코멘트 : 더 깔끔하게 구현해보자 (왜 front와 back에서 다른 로직을 쓰는지 고민)
     */
    public class _10866 {
        public static class IntDeque {

            private int capacity;
            private int[] arr;
            private int size = 0;
            private int frontPrt = 0;
            private int backPtr = 0;

            public IntDeque(int capacity) {
                this.capacity = capacity;
                arr = new int[capacity];
            }

            public void pushFront(int x) {
                frontPrt = frontPrt == 0 ? capacity - 1 : --frontPrt;
                arr[frontPrt] = x;
                size++;
            }

            public void pushBack(int x) {
                arr[backPtr] = x;
                backPtr = (backPtr + 1) % capacity;
                size++;
            }

            public int popFront() {
                if (size == 0) {
                    return -1;
                }

                int temp = arr[frontPrt];
                frontPrt = (frontPrt + 1) % capacity;
                size--;
                return temp;
            }

            public int popBack() {
                if (size == 0) {
                    return -1;
                }

                if (--backPtr < 0) {
                    backPtr = capacity - 1;
                }
                size--;
                return arr[backPtr];
            }

            public int size() {
                return size;
            }

            public int empty() {
                if (size == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

            public int front() {
                if (size == 0) {
                    return -1;
                }
                return arr[frontPrt];
            }

            public int back() {
                if (size == 0) {
                    return -1;
                }
                return arr[backPtr == 0 ? capacity - 1 : backPtr - 1];
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            IntDeque intDeque = new IntDeque(n);

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch (st.nextToken()) {
                    case "push_front":
                        intDeque.pushFront(Integer.parseInt(st.nextToken()));
                        break;

                    case "push_back":
                        intDeque.pushBack(Integer.parseInt(st.nextToken()));
                        break;

                    case "pop_front":
                        bw.write(intDeque.popFront() + "" + "\n");
                        break;

                    case "pop_back":
                        bw.write(intDeque.popBack() + "" + "\n");
                        break;

                    case "size":
                        bw.write(intDeque.size() + "" + "\n");
                        break;

                    case "empty":
                        bw.write(intDeque.empty() + "" + "\n");
                        break;

                    case "front":
                        bw.write(intDeque.front() + "" + "\n");
                        break;

                    case "back":
                        bw.write(intDeque.back() + "" + "\n");
                        break;
                }
            }
            br.close();
            bw.flush();
            bw.close();

        }
    }
