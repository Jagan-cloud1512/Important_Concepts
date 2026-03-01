import java.util.*;
public class JA {
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        int p=0;
        int c=0;
        while((1<<p)<=N)
        {
            if(((N>>p)&1)==1)
                c++;
            p++;
        }
        System.out.print(c);
    }
}
