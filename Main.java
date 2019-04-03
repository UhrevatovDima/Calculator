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
            System.out.println("Result " + Main.multiply());
        }
        if(input.equals("/")){
            System.out.println("Result " + Main.divide());
        }
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
        int[] masPlus;
        masPlus = input();
        return masPlus[0] + masPlus[1];
    }

    public static int minus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation - ");
        int[] masMinus;
        masMinus = input();
        return masMinus[0] - masMinus[1];
    }

    public static int multiply(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation * ");
        int[] masMultiply;
        masMultiply = input();
        return masMultiply[0] * masMultiply[1];
    }

    public static int divide(){
        Scanner in = new Scanner(System.in);
        System.out.println("Operation / ");
        int[] masDivide;
        masDivide = input();
        return masDivide[0] / masDivide[1];
    }
}
