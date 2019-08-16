import java.util.Scanner;

interface SimpleCalculator {
    void add(int x, int y);
    void sub(int x, int y);
}

interface ComplexCalculator extends SimpleCalculator {
    void mul(int x, int y);
    void div(int x, int y);
}

abstract class UserInput {
    abstract int getNum();
}

class Calculator extends UserInput implements ComplexCalculator {
    public void add(int x, int y) {
        System.out.printf("%d + %d = %d\n", x, y, (x + y));
    }
    public void sub(int x, int y) {
        System.out.printf("%d - %d = %d\n", x, y, (x - y));
    }
    public void mul(int x, int y) {
        System.out.printf("%d * %d = %d\n", x, y, (x * y));
    }
    public void div(int x, int y) {
        System.out.printf("%d / %d = %.2f\n", x, y, ((float)x / (float)y));
    }
    public int getNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        return in.nextInt();
    }
}

public class DanDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int x = calc.getNum();
        int y = calc.getNum();

        calc.add(x, y);
        calc.sub(x, y);
        calc.mul(x, y);
        calc.div(x, y);
    }
}