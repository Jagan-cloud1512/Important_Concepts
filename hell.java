import java.util.*;
public class hell {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        int[] A=new int[N+N+2];
        int a=0;
        for(int i=0;i<N+N+2;i++)
        {
            A[i]=z.nextInt();
            a^=A[i];
        }
        int s=0;
        while(((a>>s)&1)==0)
            s++;
        int o=0;
        int Z=0;
        for(int i:A)
        {
            if(((i>>s)&1)==0)
                o^=i;

            
            else
                Z^=i;
        }
        System.out.print(Math.min(o,Z)+" "+Math.max(o,Z));
    } 
}
