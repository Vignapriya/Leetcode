import java.util.Scanner;
class Solution {
    public static void main(String[] args)
     {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[100];
        int b=scan.nextInt();
        for(int i=0;i<=n-1;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if((a[i]+a[j])==b)
                {
                    System.out.print(a[i]+","+a[j]);
                }
            }
        }

        
    }
}
