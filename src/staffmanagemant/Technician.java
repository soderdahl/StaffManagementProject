package staffmanagemant;

import static staffmanagemant.EmployeeManagement.input;

public class Technician extends Employee {

    int nrCrash;
    int bonus;
    int basebonus = 3000;

    public Technician(String name, int salary, String gender) {
        super(name, salary, gender);
    }


    @Override
    public int bonus() {        
        System.out.println("Your basesalaray is: " + getSalary());
        System.out.println("Your basebonus is: " + basebonus);
        System.out.print("Number of crash? ");
        nrCrash = input.nextInt();
        input.nextLine();
        bonus = basebonus - nrCrash * 100;
        System.out.println("Your bonus based on your crashes is: " + bonus+"\n");
        return bonus;
    }

}
