import java.util.Scanner;

public class CountColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dài mảng: ");
        int width = sc.nextInt();
        System.out.println("Nhập rộng mảng: ");
        int height = sc.nextInt();
        int[][] arr = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("Phần tử thứ [" + i + "][" + j + "] là: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Nhập vị trí cột: ");
        int col = sc.nextInt();
        int total = 0;
        for (int i = 0; i < width; i++) {
            total += arr[i][col-1];
        }
        System.out.println("Tổng = " + total);
    }
}
