class Que15 {
    public static void main(String [] args) {
        SubEmp obj = new SubEmp();
        obj.PrintDetails();
    }
}

class Employee {
    String name = "Shubham";
    String desg = "SDE";
}

class SubEmp extends Employee{ 
    int Sal = 100000;

    public void PrintDetails() {
        System.out.println("Employee Name : " + super.name);
        System.out.println("Employee Designation : " + super.desg);
        System.out.println("Employee Salary : " + Sal);
    }
} 

