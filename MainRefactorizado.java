import java.util.Scanner;

public class MainRefactorizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número final a imprimir: ");
        int to = scanner.nextInt();

        //remove middle man
        ConsoleBasedFizzBuzzRefactorizado fizzBuzz = new ConsoleBasedFizzBuzzRefactorizado();

        fizzBuzz.imprimirFizzBuzz(1, to);

        scanner.close();
    }
}