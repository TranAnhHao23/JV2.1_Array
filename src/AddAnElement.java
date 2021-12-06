import java.util.Scanner;

public class AddAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n+1];
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) +": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Số cần chèn: ");
        int num = sc.nextInt();
        System.out.println("Vị trí cần chèn (index): ");
        int index = sc.nextInt();

        if (index < 0 || index > arr.length-1){
            System.out.println("Không chèn được nhé");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (i != index){
                    arr1[i] = arr[c];
                    c++;
                } else {
                    arr1[i] = num;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
