import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Bạn đủ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn chưa đủ tuổi trưởng thành.");
        }

        scanner.close();
    }
}
