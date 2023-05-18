//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
        // code here
     int side=0,niche=0,maxSide=0,minSide=0,maxNiche=0,minNiche=0;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='L')side--;
            else if(x=='R')side++;
            else if(x=='U')niche--;
            else niche++;
            maxSide=Math.max(maxSide,side);
            minSide=Math.min(minSide,side);
            maxNiche=Math.max(maxNiche,niche);
            minNiche=Math.min(minNiche,niche);
        }
        if(maxSide+Math.abs(minSide)+1>m)return 0;
        if(maxNiche+Math.abs(minNiche)+1>n)return 0;
        return 1;
    }
}