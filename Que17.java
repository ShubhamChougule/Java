class Que17 {
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.Speed();
        Car obj2 = new Car();
        obj2.Speed();
    }
}


class Car {
    public void Speed() {
        System.out.println("Allowed speed 150 KMPH (Car)");
    } 
}

class BMW extends Car {
    public void Speed() {
        System.out.println("Allowed speed 350 KMPH (BMW)");
    }
}