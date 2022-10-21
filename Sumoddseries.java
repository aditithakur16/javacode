public class Sumoddseries {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for(i=0; i<=100; i++){
            if(i%2!=0){
                sum= sum+i;
            }
        }
        System.out.println("Sum of odd series is"+sum);
    }
}
