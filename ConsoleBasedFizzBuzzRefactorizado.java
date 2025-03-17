//collapse hierarchy
public class ConsoleBasedFizzBuzzRefactorizado {

    //inline class
    public void imprimirFizzBuzz(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
