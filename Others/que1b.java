class que1b {
    public static void main(String[] args) {
        Message obj = new Message();
        obj.Display();
    }
}
class Message {
    void Display(){ 
        System.out.println("Hello world (using object creation)");
    }
}