
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //streamWithoutTernaryOperator();
       // StringUtils.get
    }

    private static void streamWithoutTernaryOperator() {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("abc"));
        list.add(new StringBuilder("xyz"));
        list.stream().map(x -> x.reverse());
        System.out.println(list);
    }

}