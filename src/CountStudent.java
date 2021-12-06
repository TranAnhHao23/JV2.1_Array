import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;
        System.out.println("Nhập size bạn ê: ");
        size = sc.nextInt();

        if (size > 30) {
            System.out.println("Hết dung lượng bộ nhớ rồi");
        } else {
            array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Sinh viên thứ " + (i + 1) + " có điểm là: ");
                array[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
                if (array[i] >= 5) {
                    count++;
                }
            }
            System.out.println();
            System.out.println("Số lượng học sinh đậu là " + count);

        }


    }
}
