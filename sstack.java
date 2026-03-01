import java.util.Scanner;
import java.util.Stack;

public class sstack {
    public static void main(String[] args){
        Stack <Integer> S=new Stack<>();
        Scanner z=new Scanner(System.in);
        String[] s=z.nextLine().split("#");
        for(int k=0;k<s.length-1;k++)
        {
            if(s[k].length()<=2)
            {
                int a=Integer.parseInt(s[k]);
                if(a>26||a<1)
                {
                    if(a>9)
                    System.out.printf("%c",(64+(a/10)));
                System.out.printf("%c",(64+(a%10)));
                }    
                else{
                    int c=64;
                    for(int i=0;i<a;i++)
                    {
                        c++;
                    }
                    System.out.printf("%c",c);
                }
            }
            else{
                for(int i=0;i<s[k].length()-2;i++)
                {
                    int c=64;
                    int n=s[k].charAt(i)-'0';
                    for(int j=0;j<n;j++)
                    {
                        c++;
                    }
                    System.out.printf("%c",c);
                }
                int a=Integer.parseInt(s[k].substring(s[k].length()-2, s[k].length()));
                if(a>26||a<1)
                    System.out.print(a);
                else{
                    int c=64;
                    for(int i=0;i<a;i++)
                    {
                        c++;
                    }
                    System.out.printf("%c",c);
                }
            }
        }
        String C=s[s.length-1];
        if(C.isBlank())
            return;
        for(int i=0;i<C.length();i++)
        {
            int c=64;
                    int n=C.charAt(i)-'0';
                    for(int j=0;j<n;j++)
                    {
                        c++;
                    }
                    System.out.printf("%c",c);
        }
    }
}
