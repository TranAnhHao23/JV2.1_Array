import java.util.Scanner;

public class CountColumnAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng (vuông): ");
        int dim = sc.nextInt();

        int[][] arr = new int[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.println("Phần tử thứ [" + i + "][" + j + "] là: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < dim; i++) {
            sumLeft += arr[i][i];
        }
        for (int i = 0; i < dim; i++) {
            sumRight += arr[i][arr.length - i - 1];
        }
        System.out.println("Tổng 2 cạnh chéo = " + (sumLeft + sumRight));
    }
}
