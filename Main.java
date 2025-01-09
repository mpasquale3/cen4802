/**
 * A utility class that provides methods to calculate
 * the Fibonacci se
            uence using recursion. 
 * <p>
 * This class demonstrates the use of recursive algorithms
 * for educational purposes
 * 
 * @param n the position in the Fibonacci sequence where n>= 0
 * @return the nth Fibonacci number
 * @throws IllegalArgumentExceoption if n is negative
 */

 public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
    }
}
