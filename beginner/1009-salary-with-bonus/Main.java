import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salary = scanner.nextDouble();
        double sellerReceives = scanner.nextDouble();

        double finalSalary = salary + (sellerReceives * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    }
}
