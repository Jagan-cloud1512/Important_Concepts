import java.util.*;
public class hello{
    public static int vowels(char c)
    {
        if("aeiouAEIOU".indexOf(c)!=-1)
        return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        String S=z.nextLine().strip();
        Map<Integer,Integer> m=new HashMap<>();
        int ctr=0;
        int maxlen=0;
        int idx=0;
        m.put(0,-1);
        for(char c:S.toCharArray())
        {
            int v=vowels(c);
            ctr+=(v==1?1:-1);
            if(m.get(ctr)!=null)
            {
                maxlen=Math.max(maxlen,idx-m.get(ctr));
            }
            else
            {
                m.put(ctr,idx);
            }
            idx+=1;
        }
        System.out.print(maxlen);
    }
}