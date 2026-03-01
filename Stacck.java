import java.util.*;
public class Stacck {
    public static void main(String[] args) {
        Stack <Integer> S=new Stack<>();
        Scanner z=new Scanner(System.in);
        String a;
        while(!((a=z.nextLine()).equals("a")))
        {
            int A=Integer.parseInt(a);
            if(S.isEmpty())
                S.push(A);
            else{
                int v =S.pop();
                if(v<0)
                    S.push(v+A);
                else
                    S.push(v-A);

            }
        }
        while(!(S.isEmpty()))
            System.out.print(S.pop()+" ");
    }
}
