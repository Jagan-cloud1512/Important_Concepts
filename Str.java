import java.util.*;
public class Str {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String S=z.nextLine().strip();
        int N=z.nextInt();
        System.out.print(S.substring(N-1,S.length())+""+S.substring(0,N-1));
    }  
}
