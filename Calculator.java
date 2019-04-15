public class Calculator {
    Main main = new Main();

    public int plus() {
        System.out.println("Operation + ");
        int[] inputs = main.input();
        return inputs[0] + inputs[1];
    }

    public int minus() {
        System.out.println("Operation - ");
        int[] inputs = main.input();
        return inputs[0] - inputs[1];
    }

    public int multiply() {
        System.out.println("Operation * ");
        int[] inputs = main.input();
        return inputs[0] * inputs[1];
    }

    public int divide() {
        System.out.println("Operation / ");
        int[] inputs = main.input();
        return inputs[0] / inputs[1];
    }
}