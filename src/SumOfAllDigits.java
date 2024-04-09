import java.util.Scanner;
import java.util.stream.IntStream;

// weite a java program to print sum of all digits
public class SumOfAllDigits {
    public static void main(String[] args) {
        //int number = 12345;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to sum..");
        int number = scanner.nextInt();

        IntStream s = String.valueOf(number).chars();//intStream with ASCII values
        int sum = s.map(Character::getNumericValue)
                .sum();
        System.out.println("the sum of of all digits = "+sum);
    }
}
