import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a2 = {2, 4, 6, 8, 0, 1, 3, 5, 7};
        int[] a3 = new int[a1.length + a2.length];


        for (int i = 0; i < a3.length; i++) {
            if (i < a1.length){
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i - a1.length];
            }
        }
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}
