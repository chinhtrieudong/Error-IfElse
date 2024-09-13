import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        int number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.println("Số này là số chẵn.");
        } else {
            System.out.println("Số này là số lẻ.");
        }
    }
}