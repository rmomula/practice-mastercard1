import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RestrictedElements {

        public static long restrictElements(int[] arr, int freq) {
                return Arrays.stream(arr)
                        .boxed() // Convert int stream to Stream<Integer>
                        .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue() <= freq)
                        .count();
        }
public static int restrictElements_old(int[] arr, int freq) {
        // Create a dictionary to store element counts.
        HashMap<Integer, Integer> elementCounts = new HashMap<>();
        for (int num : arr) {
        elementCounts.put(num, elementCounts.getOrDefault(num, 0) + 1);
        }

        // Filter elements exceeding the frequency limit.
        return (int) elementCounts.entrySet().stream()
        .filter(entry -> entry.getValue() <= freq)
        .count();
        }

public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3,4,4};
        int freq = 2;
        int outputLength = (int) restrictElements(arr, freq);
        System.out.println("Output array length: " + outputLength);
        }
        }