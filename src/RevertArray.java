import java.util.Scanner;

public class RevertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrLength;
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i+ ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Đảo ngược mảng có kết quả là: ");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
