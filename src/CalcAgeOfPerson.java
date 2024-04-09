import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcAgeOfPerson {
    public static void main(String[] args) {
        System.out.println("Please enter DOB in format yyyy-mm-dd format = ");
        Scanner scanner = new Scanner(System.in);

        String dob = scanner.next();
        LocalDate dboParsed = LocalDate.parse(dob);
        Period period = Period.between(dboParsed, LocalDate.now());
        System.out.println("Age of the person is = "+ period.getYears());

    }
}
