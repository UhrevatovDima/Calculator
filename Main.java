package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.calculatorInteger();
    }

    public static void calculatorInteger(){
        System.out.println("Hello, i'm Integer Calculator");
        System.out.println("Choose your operation: +, -, *, /");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(input.equals("+")){
            System.out.println("Result " + Main.plus());
        }
        if(input.equals("-")){
            System.out.println("Result " + Main.minus());
        }
        if(input.equals("*")){
            System.out.println("Result " + Main.multiplication());
        }
        if(input.equals("/")){
            System.out.println("Result " + Main.division());
        }
    }

    public static int plus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation + ");
        System.out.println("Input first number");
        int inPlus = in.nextInt();
        System.out.println("Input second number");
        int inPlus2 = in.nextInt();
        return inPlus + inPlus2;
    }

    public static int minus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation - ");
        System.out.println("Input first number");
        int inMinus = in.nextInt();
        System.out.println("Input second number");
        int inMinus2 = in.nextInt();
        return inMinus - inMinus2;
    }

    public static int multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation * ");
        System.out.println("Input first number");
        int inMultiplication = in.nextInt();
        System.out.println("Input second number");
        int inMultiplication2 = in.nextInt();
        return inMultiplication * inMultiplication2;
    }

    public static int division(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation / ");
        System.out.println("Input first number");
        int inDivision = in.nextInt();
        System.out.println("Input second number");
        int inDivision2 = in.nextInt();
        return inDivision / inDivision2;
    }
}
