import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        System.out.println("Nhập thành viên nhóm: ");
        int arrLength = sc.nextInt();
        String hocSinh[] = new String[arrLength];
        sc.nextLine();
        for (int i = 0; i < hocSinh.length; i++) {
            System.out.println("Nhập thành viên nhóm thứ " + (i + 1));
            hocSinh[i] = sc.nextLine();
        }
        System.out.println("Thông tin nhóm");
        for (int i = 0; i < hocSinh.length; i++) {
            System.out.println((i + 1) + ". " + hocSinh[i]);
        }

        System.out.println("Nhập tên học sinh: ");
        String tenHocSinh = sc.nextLine();
        for (int i = 0; i < hocSinh.length; i++) {
            if (hocSinh[i].equals(tenHocSinh)){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Thành viên thuộc nhóm mình");
        } else {
            System.out.println("Thành viên đéo thuộc nhóm mình");
        }
    }
}
