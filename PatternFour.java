import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = 0;
        int st = n;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    }
}
