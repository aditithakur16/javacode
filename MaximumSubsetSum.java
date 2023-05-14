
    //{ Driver Code Starts
import java.io.*;
import java.util.*;

public class MaximumSubsetSum {
class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.findMaxSubsetSum(N, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {

    static long help(int n,int[] arr,int index,int indication,long dp[][]){
        if(index==n)return 0;
        if(dp[index][indication]!=-1)return dp[index][indication];
        long a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
        if(indication==1){
            b=help(n,arr,index+1,0,dp);
        }
        a=arr[index]+help(n,arr,index+1,1,dp);
        return dp[index][indication]=Math.max(a,b);
    }
    public static long findMaxSubsetSum(int N, int[] A) {
        // code here
        long dp[][] = new long[N][2];
        for(long []temp:dp){
            Arrays.fill(temp,-1);
        }
        return help(N,A,0,1,dp);
    }
}
        

}
