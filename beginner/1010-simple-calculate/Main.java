import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int p1Code = scanner.nextInt();
        int p1Quantity = scanner.nextInt();
        float p1Price = scanner.nextFloat();

        int p2Code = scanner.nextInt();
        int p2Quantity = scanner.nextInt();
        float p2Price = scanner.nextFloat();

        float toBePaid = p2Price * p2Quantity + p1Price * p1Quantity;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", toBePaid);
    }    
}
