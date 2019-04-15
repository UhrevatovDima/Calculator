import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, i'm Integer Main");
        Main main = new Main();
        main.calculatorInteger();
    }

    Scanner in = new Scanner(System.in);

    public void calculatorInteger() {
        Calculator calculator = new Calculator();
        int triggerRepeat = 0;
        while (triggerRepeat == 0) {
            System.out.println("Choose your operation: +, -, *, /");
            System.out.println("For exit - input any different char");
            String input = in.next();
            switch (input) {
                case "+":
                    System.out.println("Result " + calculator.plus());
                    break;
                case "-":
                    System.out.println("Result " + calculator.minus());
                    break;
                case "*":
                    System.out.println("Result " + calculator.multiply());
                    break;
                case "/":
                    System.out.println("Result " + calculator.divide());
                    break;
                default:
                    triggerRepeat = 1;
            }
        }
    }

    public int[] input() {
        int[] mas = new int[2];
        System.out.println("Input first number");
        mas[0] = in.nextInt();
        System.out.println("Input second number");
        mas[1] = in.nextInt();
        return mas;
    }
}