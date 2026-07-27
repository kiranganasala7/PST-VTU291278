import java.util.function.Predicate;

public class task8 {
    public static void main(String[] args) {
        Predicate<Integer> isPalindrome = (n) -> {
            int original = n, reversed = 0;
            while (n > 0) {
                reversed = reversed * 10 + (n % 10);
                n /= 10;
            }
            return original == reversed;
        };
        
        int num = 121;
        System.out.println(num + " is palindrome? " + isPalindrome.test(num));
    }
}
