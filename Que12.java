class Simple {
    int num1;
    int num2;

    Simple() {
        this.num1 = 30;
        this.num2 = 5;
    }

    public void Add() {
        System.out.println("Addition of " + num1 + " and " +
                            num2 + " is : " + (num1 + num2));
    }

    public void Mul() {
        System.out.println("Multiplication of " + num1 + " and " +
                            num2 + " is : " + (num1 * num2));
    }
}

public class Que12 {
    public static void main(String[] shubham) {
        Simple obj = new Simple();
        obj.Add();
        obj.Mul();
    }
}