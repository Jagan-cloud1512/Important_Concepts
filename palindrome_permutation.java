import java.util.*;
public class palindrome_permutation {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String s = z.next();
        int flag = 0;
        for (char ch : s.toCharArray()) {
            flag ^= (1 << (ch - 'a'));
        }
        if (flag == 0 || (flag & (flag - 1)) == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
