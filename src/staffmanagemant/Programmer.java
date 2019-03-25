package staffmanagemant;

import static staffmanagemant.EmployeeManagement.input;

public class Programmer extends Employee {
int nrApplication;
int basebonus = 5000;
    public Programmer(String name, int salary, String gender) {
        super(name, salary, gender);
    }

    @Override
    public int bonus() {        
        System.out.println("Your basesalaray is: " + getSalary());
        System.out.println("Your basebonus is: " + basebonus);
        System.out.print("Number of application? ");
        nrApplication = input.nextInt();
        input.nextLine();
        int bonus = basebonus + nrApplication * 1000;
        System.out.println("Your bonus based on your crashes is: " + bonus+"\n");
        return bonus;
    }


}
