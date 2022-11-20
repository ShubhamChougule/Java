import java.util.*;
class que10 {
    public static void main(String [] args) {
        int num;
        System.out.print("Enter an number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ShubhamMath obj = new ShubhamMath();
        boolean res = obj.checkpalindrome(num);

        if(res) {
            System.out.println(num + " is a palindrome number...");
        } else {
            System.out.println(num + " is not a palindrome number...");
        }
    }
}
class ShubhamMath{
    boolean checkpalindrome(int num) {
        int newnumber = 0;
        int temp = num;
        int d = 0;
        while(temp != 0) {
            d = temp % 10;
            newnumber *= 10;
            newnumber += d;
            temp /= 10;
        }
        return newnumber == num;
    }
}