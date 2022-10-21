public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 3, 1 };
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}