class Parent {
    public void M1() {
        System.out.println("Class Parent Method M1");
    }
}
  
class Child extends Parent {
    public void M2() {
        System.out.println("Class Child Method M2");
    }
}

public class Que14A {
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.M1();
        obj.M2();
    }
}