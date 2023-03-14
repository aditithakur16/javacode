public class AnonyArray {
    public static void main(String [] args)
    {
        sum(new int[] {10, 20, 30, 40, 50});
    }
    public static void sum(int[] x)
    {
       int sum = 0;
       int i = 0;
        for(i=0; i<x.length; i++)
        {
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
    
}
