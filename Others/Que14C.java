class Parent {
    public void M1() {
        System.out.println("Class Parent Method M1");
    }
}
  
class Child1 extends Parent {
    public void M2() {
        System.out.println("Class Child1 Method M2");
    }
}

class Child2 extends Parent {
    public void M3() {
        System.out.println("Class Child2 Method M3");
    }
}

class Child3 extends Parent {
    public void M4() {
        System.out.println("Class Child3 Method M4");
    }
}

public class Que14C {
    public static void main(String[] args)
    {
        Child1 obj1 = new Child1();
        obj1.M1();
        obj1.M2();
        Child2 obj2 = new Child2();
        obj2.M1();
        obj2.M3();
        Child3 obj3 = new Child3();
        obj3.M1();
        obj3.M4();
    }
}