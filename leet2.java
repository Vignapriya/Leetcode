import java.util.Scanner;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            merged[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            merged[nums1.length+i]=nums2[i];
        }
        int temp;
        for(int i=0;i<merged.length;i++)
        {
            for(int j=i+1;j<merged.length;j++)
            {
                if(merged[i]>merged[j])
                {
                    temp=merged[i];
                    merged[i]=merged[j];
                    merged[j]=temp;

                }

            }

        }
        int size=nums1.length+nums2.length;
        int med=size/2;
        if(size%2!=0)
        {
            return merged[med];
        }
        else
        {
            double median=(merged[med]+merged[med-1])/2.0;
            return median;
        }

        
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=scan.nextInt();
        }
        double a=findMedianSortedArrays(arr1,arr2);
        System.out.print(a);
    }
}
