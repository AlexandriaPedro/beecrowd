import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  IOException {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int workedHours = scanner.nextInt();
        float receivedPerHour = scanner.nextFloat();

        float salary = receivedPerHour * workedHours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
