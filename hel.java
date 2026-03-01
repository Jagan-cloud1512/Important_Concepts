import java.util.*;
public class hel {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        int a=0;
        for(int i=1;i<=N+N+1;i++)
        {
            int n=z.nextInt();
            a^=n;
        }
        System.out.print(a);
    } 
}
