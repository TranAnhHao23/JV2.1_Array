import java.util.Scanner;

public class DeleteItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị cần xóa: ");
        int num = sc.nextInt();
        int[] arr1 = {1, 2, 3, 4, 5, 5, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num){
                for (int j = i; j < arr1.length-1; j++) {
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = 0;
                }
                i--;
                count++;
            }
        }
        if (count == 0){
            System.out.println(num + " không có trong dãy, mảng không thay đổi");
        } else {
            System.out.println(num + " có trong dãy, mảng mới sẽ là: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+ " ");
            }

        }

    }

}
