import java.util.Scanner;

public class FindMaxDoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dài mảng: ");
        int width = sc.nextInt();
        System.out.println("Nhập rộng mảng: ");
        int height = sc.nextInt();
        int[][] arr = new int[width][height];
        int max = arr[0][0];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("Phần tử thứ ["+i+"]["+j+"] là: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị max = " + max);
    }
}
