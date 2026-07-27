import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // example
        Arrays.sort(arr);
        System.out.println(k + "rd smallest element: " + arr[k-1]);
    }
}
