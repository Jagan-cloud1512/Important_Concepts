import java.util.*;

public class h{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int r=z.nextInt();
        int c=z.nextInt();
        int[][] a=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=z.nextInt();
            }
        }
        for(int i=1;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                int m=Integer.MIN_VALUE;
                for(int j=0;j<c;j++)
                {
                    if(k==j)
                        continue;
                    m=Math.max(m,a[i-1][j]);
                }
                a[i][k]=a[i][k]+m;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 System.out.print(a[i][j]+" ");
            }
        }
    }
}