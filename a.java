import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] a=new int[n+1];
        int[] p=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=z.nextInt();
        }
        p[0]=0;
        for(int i=1;i<=n;i++)
        {
            p[i]=p[i-1]+a[i];
        }
        int q=z.nextInt();
        while((q--)!=0)
        {
            int s=z.nextInt();
            int e=z.nextInt();
            System.out.print(p[e]-p[s-1]);
        }
    }
}
