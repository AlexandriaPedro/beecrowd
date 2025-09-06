
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int maior(int x, int y) {
        return (x + y + Math.abs(x - y)) / 2;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = maior(a, b);
        int maiorABC = maior(maiorAB, c);

        System.out.println(maiorABC + " eh o maior");
    }
}
