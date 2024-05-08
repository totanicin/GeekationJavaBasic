package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        printResult(add(a, b));
        printResult(subtract(a, b));
        printResult(multiply(a, b));
        printResult(divide(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static void printResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }
}
