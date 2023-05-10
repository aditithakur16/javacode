import java.util.Scanner;

public class WatchingMovieAt2X {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int a = y/2;
		System.out.println(x-a);
	}
}
