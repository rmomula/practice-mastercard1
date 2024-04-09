public class OverloadingPassNullCheck {
    public static void main(String[] args) {
       // overloadedMethod(null);
    }

    private static void overloadedMethod(String s) {
        System.out.println("Inside string pass method");
    }
    private static void overloadedMethod(Integer s) {
        System.out.println("Inside string pass method");
    }
}
