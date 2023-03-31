import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int d = getValue(n, b1, b2);
        System.out.println(d);
    }

    public static void getValue(int n, int b1, int b2){
        int dec = getValueIndecimal(n, b1);
        int dn = getValueInBase(dec, b2);
        return dn;

    }
    puclic static int getValueIndecimal(int n, int b){
        int rv = 0;

        int p = 1;
        while(n > 0){
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * b;
        }
        return rv;
    }
}
