import java.util.Scanner;

public class Digit {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;
        int temp = n;
        while(temp !=0){
            temp = temp/10;
            nod++;
        }

        int div = (int)Math.pow(10, nod-1);
        while(div !=0){
            int q = n /div;
            System.err.println(q);

            n = n%div;
            div = div / 10;
        }
    }
}
