import java.util.Arrays;

public class SumArray {
    public static int sumArray (int [] numbers) {
        try {
            if (numbers.length <= 1) {
                return 0;
            } else {
                int sum = 0;
                Arrays.sort(numbers);
                for (int i = 1; i < numbers.length-1 ; i++) {
                    sum += numbers[i];
                    System.out.println("numbers[i]: " + numbers[i]);
                    System.out.println("sum: " + sum);
                }
                return sum;
            }
        } catch (NullPointerException exception) {
            return 0;
        }
    }
}
