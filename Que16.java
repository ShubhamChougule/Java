class Que16 {
    public static void main(String[] args) {
        Math obj = new Math();
        obj.Add(5,2);
        obj.Add(1.3f, 4.4f);
    }
}

class Math {
    void Add(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is : " + (a+b));
    }
    void Add(float a, float b) {
        System.out.println("Addition of " + a + " and " + b + " is : " + (a+b));
    }
}