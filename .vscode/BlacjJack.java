/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BlackJack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i <= t; i++){
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int d=0;
	        for(int j=1;j<=10;j++){
	           d=a+b+j;
	            if(d==21) { System.out.println(j); break;}
	           }
	           if(d!=21) System.out.println(-1);   
	        
	        	    }
		
	}
}
