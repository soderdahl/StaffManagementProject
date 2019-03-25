
package staffmanagemant;

import static staffmanagemant.EmployeeManagement.input;


public class Receptionist extends Employee {
int basebonus = 2000;
int nrOvertime;
    public Receptionist(String name, int salary, String gender) {
        super(name, salary, gender);
    }

    @Override
    public int bonus() {         
        System.out.println("Your basesalaray is: " + getSalary());
        System.out.println("Your basebonus is: " + basebonus);
        System.out.print("Number of overtime? ");
        nrOvertime = input.nextInt();
        input.nextLine();
        int bonus = basebonus + nrOvertime * 150;
        System.out.println("Your bonus based on your overtime is: " + bonus+"\n");        
        return bonus;
       
    }

   
}
