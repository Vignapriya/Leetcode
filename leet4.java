import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) 
    {
        int original=x;
        int rem=0;
        while(x>0)
        {
            int r=x%10;
            rem=rem*10+r;;
            x=x/10;
        }
        if(rem==original)
        {
            return true;
            
        }
        else
        {
            return false;
        }

    }

public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    Boolean a=isPalindrome(n);
    System.out.print(a);
}
}
