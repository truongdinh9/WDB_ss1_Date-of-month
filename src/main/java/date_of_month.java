import java.util.Scanner;

public class date_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + "co 31 ngay.");
                break;
            default:
                if (month < 12 && month > 0) {
                    System.out.println("Thang " + month + "co 30 ngay.");
                } else {
                    System.out.println("Thang khong hop le ");
                }
        }
    }
}
