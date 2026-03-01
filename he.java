import java.util.*;
public class he {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        String S="";
        while(N!=0)
        {
            if(N%2==0)
            {
                S=S+'0';
                N=N/2;
            }
            if(N%2==1)
            {
                S=S+'1';
                N=N/2;
            }
        }
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='1')
            {
                System.out.print((int)Math.pow(2,i));
                if(i!=S.length()-1)
                    System.out.print("+");
            }
        }
    }
}
