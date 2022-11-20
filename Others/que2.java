import java.util.*;

class que2 {
    public static void main(String [] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();
        
        int A = num1 + num2;
        int S = num1 - num2;
        int M = num1 * num2;
        int D = num1 / num2;

        System.out.println("Addition is : "+ A);
        System.out.println("Subtraction is : "+ S);
        System.out.println("Multiplication is : "+ M);
        System.out.println("Division is : "+ D);
    }
}

