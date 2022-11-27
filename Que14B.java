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

class Subchild extends Child {
    public void M3() {
        System.out.println("Class Subchild Method M3");
    }
}

public class Que14B {
    public static void main(String[] args)
    {
        Subchild obj = new Subchild();
        obj.M3();
        obj.M2();
        obj.M1();
    }
}