import java.util.*;
public class helloo {
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        if((N&(N-1))==0)
            System.out.print("S");
        else
            System.out.print("N");
    }
}
