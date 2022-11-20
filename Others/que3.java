import java.util.*;

class que3 {
    public static void main(String [] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number : ");
        num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.print(num + " is EVEN number");
        } else {
            System.out.print(num + " is ODD number");
        }
    }
}

