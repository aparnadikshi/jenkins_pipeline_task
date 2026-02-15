public class Test {

    // Addition
    static void add(int a, int b) {
        int res = a + b;
        System.out.println("Addition result: " + res);
    }

    // Subtraction
    static void sub(int a, int b) {
        int res = a - b;
        System.out.println("Subtraction result: " + res);
    }

    // Multiplication
    static void mul(int a, int b) {
        int res = a * b;
        System.out.println("Multiplication result: " + res);
    }

    // Division
    static void div(int a, int b) {
        if (b != 0) {
            double res = (double) a / b;
            System.out.println("Division result: " + res);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method
    public static void main(String[] args) {
        int x = 58;
        int y = 10;

        add(x, y);
        sub(x, y);
        mul(x, y);
        div(x, y);
    }
}


