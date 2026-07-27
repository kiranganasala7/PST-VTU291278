import java.util.function.BiFunction;

public class task9 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumLastDigits = (a, b) -> (a % 10) + (b % 10);
        
        int num1 = 123, num2 = 456;
        System.out.println("Sum of last digits: " + sumLastDigits.apply(num1, num2));
    }
}
