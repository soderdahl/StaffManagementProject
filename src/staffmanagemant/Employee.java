package staffmanagemant;

import java.util.Scanner;

public abstract class Employee {

    private String name;
    private int id;
    private int salary;
    private String gender;

    static int idGenerator = 1;

    public Employee(String name, int salary, String gender) {

        this.id = idGenerator;
        idGenerator++;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    abstract public int bonus();

    public int totalSalary() {
        int tot = getSalary() + bonus();
//        System.out.println("Your total salary is " + tot);
        System.out.println("");
        System.out.println("");
        return tot;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
