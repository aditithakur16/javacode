import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int on1 = n1;//for lcm we need original values of n1 nd n2 by calulating the value of n1 and n2 are changed that's why I store the value of
        int on2 = n2;// n1 and n2 as original n1 and n2

        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        
        int gcd = n2;
        int lcm = (on1 * on2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
    
}
