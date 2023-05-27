import java.util.Scanner;

public class DiscusThrow {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int i = 1; i <= t; i++){
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    
		    if(a>=b && a>=c){
		        System.out.println(a);
		    }else if(b>=a && b>=c){
		        System.out.println(b);
		    }else{
		        System.out.println(c);
		    }
		}
	}
}


