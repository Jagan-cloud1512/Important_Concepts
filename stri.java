import java.util.*;
public class stri {
    public static void s(String S,int i){
        if(i>S.length()-1)
            return;
        s(S,i+1);
        char C=S.charAt(i);
        System.out.print(C);
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        String S=z.nextLine().strip();
        int i=0;
        s(S,i);
    }
}
