import java.util.*;
class matrix_prefix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix size:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row+1][col+1];
        
        for(int i=1;i<=row;i++) {
            for (int j = 1; j <= col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int r=1;r<=row;r++){
            for(int c=2;c<=col;c++) {
                arr[r][c] = arr[r][c - 1] + arr[r][c];
            }
        }
        
        for(int r=2;r<=row;r++) {
            for (int c = 1; c <= col; c++) {
                arr[r][c]=arr[r-1][c]+arr[r][c];
            }
        }
        
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q!=0)
        {
            int srow=sc.nextInt();
            int scol=sc.nextInt();
            int erow=sc.nextInt();
            int ecol=sc.nextInt();
            int sum = arr[erow][ecol] - arr[erow][scol-1] - arr[srow-1][ecol] + arr[srow-1][scol-1];
            System.out.println(sum);
            q--;
        }
    }
}