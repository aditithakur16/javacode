import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RightThere
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i <= t; i++){
		    int n = scn.nextInt();
		    int x = scn.nextInt();
		    if(n<=x){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
