public class ArrayCheck {
    public static void main(String [] args){
        int[] a = {10, 20, 30, 40, 50};
        int[] b= {60, 70};
        a=b;
        b=a;
        System.err.println("b[0]+b[1]");
    }
    
}
