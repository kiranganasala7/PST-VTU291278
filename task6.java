import java.util.function.Function;

public class task6 {
    public static void main(String[] args) {
        int num = 123456;
        
        Function<Integer, Integer> evenDigitSum = (n) -> {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                if (d % 2 == 0) sum += d;
                n /= 10;
            }
            return sum;
        };
        
        Function<Integer, Integer> oddDigitSum = (n) -> {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                if (d % 2 != 0) sum += d;
                n /= 10;
            }
            return sum;
        };
        
        System.out.println("Even digit sum: " + evenDigitSum.apply(num));
        System.out.println("Odd digit sum: " + oddDigitSum.apply(num));
    }
}
