import java.util.*;
public class swapodd {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N=z.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=z.nextInt();
        }
        int l=0;
        int r=N-1;
        while(l<r){
            if(a[l]%2==1)
            {
                if(a[r]%2==1)
                {
                    int t=a[l];
                    a[l]=a[r];
                    a[r]=t;
                    l++;
                    r--;
                }
                else
                    r--;
            }
            else
                l++;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
