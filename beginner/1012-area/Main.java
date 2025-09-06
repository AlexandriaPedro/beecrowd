import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float rectangledTriangleArea = (a * c) / 2;

        double pi = 3.14159;
        double circleArea = pi * (c * c);

        float trapeziumArea = ((a + b) * c) / 2;

        float squareArea = b * b;

        float rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f\n", rectangledTriangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);
    }
}
