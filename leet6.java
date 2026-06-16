import java.util.Scanner;
class Solution {
    public static double myPow(double x, int n)
     {
        double res=Math.pow(x,n);
        return res;
        
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        int b=scan.nextInt();
        double ans=myPow(a,b);
        System.out.print(ans);


    }
}
