public class PaperCutting {
    
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i <= t; i++){
		    int k = scn.nextInt();
		    int n = scn.nextInt();
		    System.out.println((k/n)*(k/n));
		}
	}

}
