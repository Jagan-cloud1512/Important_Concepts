import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=z.nextInt();
        }
        for(int i=0;i<N/2;i++)
        {
            int t=a[i];
            a[i]=a[N-1-i];
            a[N-1-i]=t;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
