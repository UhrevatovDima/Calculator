import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello, i'm Integer Calculator");
        Calculator.calculatorInteger();
    }

    public static void calculatorInteger(){
        System.out.println("Choose your operation: +, -, *, /");
        System.out.println("For exit - input any different char");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(input.equals("+")){
            System.out.println("Result " + Calculator.plus());
        }
        if(input.equals("-")){
            System.out.println("Result " + Calculator.minus());
        }
        if(input.equals("*")){
            System.out.println("Result " + Calculator.multiply());
        }
        if(input.equals("/")){
            System.out.println("Result " + Calculator.divide());
        }
        calculatorInteger();
    }

    public static int[] input(){
        Scanner in = new Scanner(System.in);
        int[] mas = new int[2];
        System.out.println("Input first number");
        mas[0] = in.nextInt();
        System.out.println("Input second number");
        mas[1] = in.nextInt();
        return mas;
    }

    public static int plus(){
        System.out.println("Operation + ");
        int[] inputs = input();
        return inputs[0] + inputs[1];
    }

    public static int minus(){
        System.out.println("Operation - ");
        int[] inputs = input();
        return inputs[0] - inputs[1];
    }

    public static int multiply(){
        System.out.println("Operation * ");
        int[] inputs = input();
        return inputs[0] * inputs[1];
    }

    public static int divide(){
        System.out.println("Operation / ");
        int[] inputs = input();
        return inputs[0] / inputs[1];
    }
}
