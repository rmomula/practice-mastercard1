import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class multiplyNumbers {
    //1 to 10 elements, program to make output multiple of 5 that is 5, 10
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .map(i -> i * 5)
                .forEach(System.out::println);
    }
}
