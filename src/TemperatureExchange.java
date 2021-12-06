import java.util.Scanner;

public class TemperatureExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Chuyển độ C sang độ F");
            System.out.println("2. Chuyển độ F sang độ C");
            System.out.println("0. Thoát thôi");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chuyển độ C sang độ F");
                    System.out.println("Muốn số nào: ");
                    double celsius = sc.nextDouble();
                    System.out.println(celsius + " độ C = "+ celsiusToFahrenheit(celsius) + " độ F");
                    break;
                case 2:
                    System.out.println("Chuyển độ F sang độ C");
                    System.out.println("Muốn số nào: ");
                    double fahren = sc.nextDouble();
                    System.out.println(fahren + " độ F = "+ fahrenheitToCelsius(fahren) + " độ C");
                    break;
                case 0:
                    System.out.println("Exit à?");
                    break;
                default:
                    System.out.println("Làm lại !!!");
            }
        } while (choice != 0);

    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    };
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    };
}