import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello, i'm Integer Calculator");
        Calculator calculator = new Calculator();
        calculator.calculatorInteger();
    }

    Scanner in = new Scanner(System.in);

    public void calculatorInteger(){
        int triggerRepeat = 0;
        while(triggerRepeat == 0){
            System.out.println("Choose your operation: +, -, *, /");
            System.out.println("For exit - input any different char");
            String input = in.next();

            switch(input){
                case "+" : System.out.println("Result " + plus());
                    break;
                case "-" : System.out.println("Result " + minus());
                    break;
                case "*" : System.out.println("Result " + multiply());
                    break;
                case "/" : System.out.println("Result " + divide());
                    break;
                default: triggerRepeat = 1;
            }
        }
    }

    public int[] input(){
        Scanner in = new Scanner(System.in);
        int[] mas = new int[2];
        System.out.println("Input first number");
        mas[0] = in.nextInt();
        System.out.println("Input second number");
        mas[1] = in.nextInt();
        return mas;
    }

    public int plus(){
        System.out.println("Operation + ");
        int[] inputs = input();
        return inputs[0] + inputs[1];
    }

    public int minus(){
        System.out.println("Operation - ");
        int[] inputs = input();
        return inputs[0] - inputs[1];
    }

    public int multiply(){
        System.out.println("Operation * ");
        int[] inputs = input();
        return inputs[0] * inputs[1];
    }

    public int divide(){
        System.out.println("Operation / ");
        int[] inputs = input();
        return inputs[0] / inputs[1];
    }
}