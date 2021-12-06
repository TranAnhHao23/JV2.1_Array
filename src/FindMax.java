import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int arrLength = sc.nextInt();

        int arr[] = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Hiển thị mảng: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max);
    }
}
