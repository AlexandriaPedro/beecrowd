import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        soma =  num1 + num2;

        System.out.print("X = " + soma + "\n");
 
    }
 
}