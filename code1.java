import java.util.*;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String[] inputs = {"10", "20", "30", "40", "50"};
        
        // Parsing strings into Integer objects (autoboxing)
        for (String input : inputs) {
            numbers.add(Integer.parseInt(input));
        }
        
        // Calculating the sum with unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing happens here
        }
        
        System.out.println("Sum: " + sum);
    }
}
