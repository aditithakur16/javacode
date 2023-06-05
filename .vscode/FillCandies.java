
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FillCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i <= t; i++){
		    int n = scn.nextInt();
		    int k = scn.nextInt();
		    int m = scn.nextInt();
		    if((n%(k*m))==0){
		        System.out.println(n/(k*m));
		    }
		    else{
		        System.out.println((n/(k*m))+1);
		    }
		}
	}
}
