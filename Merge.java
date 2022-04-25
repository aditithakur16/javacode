public class Merge {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 5, 7 };
        int[] arr2 = { 4, 6, 8, 9 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        for (int z = 0; z < result.length; z++) {
            System.out.print(result[z] + " ");
        }
    }

}