import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        int prod;

        prod = a * b;

        System.out.println("PROD = " + prod);
    }
}