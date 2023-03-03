import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for(int div = 2; div * div <= n; div++){
            while(n % div == 0){         //if n divided by 2 ang give reminder 0 again the remaing value divided by 2   
                n = n / div;
                System.out.print(div + " ");    // print div mean divisor 2 2 3 like that
            }
        }

        if(n != 1){
            System.out.print(n);
        }
    }
    
}
