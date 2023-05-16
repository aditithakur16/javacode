

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PoliceAndThief
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i<=t; i++){
		    int x = scn.nextInt();
		    int y = scn.nextInt();
		    if(x>=y){
		        System.out.println(x-y);
		    }else{
		        System.out.println(y-x);
		    }
		}
	}
}