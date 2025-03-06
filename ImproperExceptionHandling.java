class Calculator {
    public void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}

public class ExceptionHandlingResolved {
    public static void main(String[] args) {
        new Calculator().divide(10, 0);
    }
}
