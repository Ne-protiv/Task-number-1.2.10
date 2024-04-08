import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        Double a = sc.nextDouble();
        System.out.println("Введите b");
        Double b = sc.nextDouble();
        System.out.println("Введите c");
        Double c = sc.nextDouble();
        boolean result = doubleExpression(a, b, c);
        System.out.println(result);
    }
    public static boolean doubleExpression(Double a, Double b, Double c) {
        final double EPSILON = 1E-4;
        return -EPSILON < a + b - c && a + b - c  < EPSILON;

    }
}

