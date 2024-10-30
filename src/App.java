import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Recursividad serie = new Recursividad();
        System.out.print("Ingresar para calcular el numero Fibonacci : ");
        int n = scanner.nextInt();
        int fibonacci = serie.fibonacci(n);
        System.out.println("Fibonacci de " + n + " es : " + fibonacci);

    }
}
