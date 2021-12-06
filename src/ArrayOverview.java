import java.util.Scanner;

public class ArrayOverview {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Con số nào đây: ");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                for (int j = i; j < arr.length - count; j++) {
                    int temp = 0;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(count);
        if (count == 0) {
            System.out.println("Không có thay đổi rì");
        }else {
            int[] arrnew = new int[arr.length - count];
            for (int i = 0; i < arrnew.length; i++) {
                arrnew[i] = arr[i];
                System.out.print(arrnew[i] + " ");
            }
        }

    }
}
