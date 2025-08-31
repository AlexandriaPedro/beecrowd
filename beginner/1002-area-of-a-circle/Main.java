import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double r;
        double pi = 3.14159;

        r = scanner.nextDouble();

        double a = (r * r)* pi;
        

        System.out.printf("A=%.4f\n", a);
        
        
    }
 
}