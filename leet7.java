import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
class RecentCounter {
    private Queue<Integer> q;
    public RecentCounter()

    {
        this.q=new ArrayDeque<>();
    }
    
    public int ping(int t)
    {
       q.offer(t);
       

       while(!q.isEmpty() && q.peek()<(t-3000))
       {
         q.poll();
        
       } 
       return q.size();
    }
    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
        int t1=scan.nextInt();
        RecentCounter r=new RecentCounter();
        r.ping(t1);


    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
