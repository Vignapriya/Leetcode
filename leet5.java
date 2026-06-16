import java.util.Scanner;
import java.util.HashMap;
class Solution {
    public static int romanToInt(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int size=s.length();
        int sum=0;
        for(int i=0;i<size;i++)
        {
            int cval=map.get(s.charAt(i));
            if(i+1<size)
            {
                int nval=map.get(s.charAt(i+1));
            if(cval<nval)
            {
                sum-=cval;
            }
            else
            {
                sum+=cval;
            }
            }
            else
            {
                sum+=cval;
            
            }

        }
        return sum;
        

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.next().toUpperCase();
        int n=romanToInt(a);
        System.out.print(n);
    }
}
