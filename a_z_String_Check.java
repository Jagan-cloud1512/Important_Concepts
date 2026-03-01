import java.util.*;
public class a_z_String_Check {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String s = z.nextLine();
        int flag = 0;
        for (char ch : s.toCharArray()) {
            flag |= (1 << (ch - 'a'));
        }
        if (flag == (1 << 26) - 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
