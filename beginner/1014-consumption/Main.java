
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        float y = scanner.nextFloat();

        float carsConsumption = x / y;

        System.out.printf("%.3f km/l\n", carsConsumption);
    }
}
