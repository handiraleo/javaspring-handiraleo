import java.util.*;
public class Problem6 {
     
    public static int maxSum(int arr[], int n, int k)
    {
        
        if (n < k)
        {
           System.out.println("Invalid");
           return -1;
        }
      
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
      
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }
     
    public static void main(String[] args)
    {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}

