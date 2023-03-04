import java.util.Scanner;

public class PatternThree {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sp = n-1;       // sp mean space
        int st = 1;         // st mean star
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
    
}
