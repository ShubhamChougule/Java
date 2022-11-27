class Simple {
    int num1;
    int num2;

    Simple(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public void Sub() {
        int res = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " +
                            num2 + " is : " + res);
    }

    public void Div() {
        int res = num1 / num2;
        System.out.println("Division of " + num1 + " and " + 
                            num2 + " is : " + res);
    }
}

public class Que13 {
    public static void main(String[] shubham) {
        Simple obj = new Simple(45, 15);
        obj.Sub();
        obj.Div();
    }
}