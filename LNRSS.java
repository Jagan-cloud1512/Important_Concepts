import java.util.*;
public class LNRSS {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String s=z.nextLine();
        int n=s.length();
        int l=0;
        int i=-1;
        Set<Character> S = new HashSet<>();
        for(int r=0;r<n;r++){
            while(S.contains(s.charAt(r))) {
                S.remove(s.charAt(l));
                l++;
            }
            S.add(s.charAt(r));
            i=l;
        }
        if(S.size()>=3){
            System.out.println(s.substring(i,i+S.size()));
        }
        else{
            System.out.println(-1);
        }
    }
}

