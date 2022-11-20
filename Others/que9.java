import java.util.*;

class que9 {
    public static void main(String [] args) {
        int num;
        System.out.print("Enter an number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ShubhamMath obj = new ShubhamMath();
        boolean res = obj.checkprime(num);

        if(res) {
            System.out.println(num + " is prime number...");
        } else {
            System.out.println(num + " is not a prime number...");
        }
    }
}
class ShubhamMath{
    boolean checkprime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                 return false;
            }
        }
        return true;
    }
}