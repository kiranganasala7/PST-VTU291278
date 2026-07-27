import java.util.function.IntFunction;

public class task7{
    public static void main(String[] args) {
        IntFunction<Integer> fib = (n) -> {
            if (n <= 1) return n;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        };
        
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib.apply(n));
    }
}
