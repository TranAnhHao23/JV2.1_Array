
import java.util.Scanner;

public class CountSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String s;
        int count = 0;
        System.out.println("Nhập 1 chuỗi bất kỳ đi: ");
        str = sc.nextLine();
        System.out.println("Nhập ký tự muốn tìm: ");
        s = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            String kyTu = String.valueOf(str.charAt(i));
            if (s.equals(kyTu)) {
                count++;
            }
        }
        System.out.println("Tổng số ký tự " + s + " trong chuỗi đã nhập = " + count);
    }
}
