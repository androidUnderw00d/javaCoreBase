package lesson5;

public class Employee {

    protected String name;
    protected String position;
    protected String email;
    protected String cell;
    protected int salary;
    protected int age;

    public Employee(String name, String position, String email, String cell, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.cell = cell;
        this.salary = salary;
        this.age = age;
    }

    void printEmployee(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", cell='" + cell + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
