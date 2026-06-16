import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int i=0;i<tickets.length;i++)
        {
           q.offer(i);
        }
        while(!q.isEmpty())
        {
            int current=q.poll();
            tickets[current]--;
            count++;
        
        if(current==k && tickets[k]==0)
        {
            return count;
        }
        if(tickets[current]>0)
        {
            q.offer(current);
        }
        
        }
        return count;
        


 }
    public static void main(String[] args)
    {
       
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] tick=new int[n];
        for(int i=0;i<n;i++)
        {
            tick[i]=scan.nextInt();
        }
        int a=scan.nextInt();
        int op=timeRequiredToBuy(tick,a);
        System.out.print(op);
    }
}
