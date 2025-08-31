import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        float a;
        float b;

        a = scanner.nextFloat();
        b = scanner.nextFloat();

        float media;

        media = (float) ((a * 3.5 + b * 7.5) / (3.5 + 7.5));

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
