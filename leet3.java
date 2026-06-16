import java.util.Scanner;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
    int n = nums2.length;
    int[] merged = new int[m + n];
    
    int i = 0; 
    int j = 0; 
    int k = 0; 
    
    
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            merged[k] = nums1[i];
            i++;
        } else {
            merged[k] = nums2[j];
            j++;
        }
        k++;
    }
    
    while(i<m)
    {
        merged[k] = nums1[i];
        i++;
        k++;
    }
    while (j < n) {
        merged[k] = nums2[j];
        j++;
        k++;
    }
    int size = m + n;
    int med = size / 2;
    if (size % 2 != 0) {
        return merged[med];
    } else {
        return (merged[med] + merged[med - 1]) / 2.0;
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
