import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 whole numbers from the user
        System.out.println("Enter 10 whole numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Sort the numbers in descending order using Arrays.sort()
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the sorted numbers in descending order
        System.out.println("The numbers in descending order are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


