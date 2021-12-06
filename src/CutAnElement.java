import java.util.Scanner;

public class CutAnElement {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {0,1,2,3,4,5,5,6,7,8,9};
        System.out.println("Nhập giá trị muốn xóa: ");
        int num = sc.nextInt();
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != num){
                arr1[c] = arr1[i];
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
