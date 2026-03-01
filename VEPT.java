import java.util.*;
public class VEPT {
 static int[] arr;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> best = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);

                int a = arr[i];
                int b = arr[j];

                while (true) {
                    int next = a + b;
                    int index = findIndex(next, j + 1);

                    if (index == -1) break;

                    temp.add(next);
                    a = b;
                    b = next;
                    j = index;   // move forward
                }

                if (temp.size() >= 4) {
                    if (temp.size() > best.size() ||
                       (temp.size() == best.size() && isSmaller(temp, best))) {
                        best = new ArrayList<>(temp);
                    }
                }
            }
        }

        if (best.size() >= 4) {
            for (int x : best) System.out.print(x + " ");
        } else {
            System.out.println(-1);
        }
    }

    static int findIndex(int value, int start) {
        for (int i = start; i < N; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    static boolean isSmaller(List<Integer> a, List<Integer> b) {
        if (b.isEmpty()) return true;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) return true;
            if (a.get(i) > b.get(i)) return false;
        }
        return false;
    }
}