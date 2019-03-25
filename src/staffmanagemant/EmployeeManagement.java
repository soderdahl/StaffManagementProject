package staffmanagemant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagement {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();

    private static int salary;
    private static String name;
    private static String gender;
    private static int id;
    private static int nrOfTechnician = 3;
    private static int nrOfProgrammer = 3;
    private static int nrOfReception = 3;

    public static void add3OfEachOccupation() {
        Technician t1 = new Technician("Niklas", 27000, "Male");
        Technician t2 = new Technician("Kalle", 26000, "Male");
        Technician t3 = new Technician("Olle", 27500, "Male");

        Programmer p1 = new Programmer("Fredrik", 40000, "Male");
        Programmer p2 = new Programmer("Patrik", 45000, "Male");
        Programmer p3 = new Programmer("Johan", 50000, "Male");

        Receptionist r1 = new Receptionist("Karin", 24500, "Female");
        Receptionist r2 = new Receptionist("Nina", 26500, "Female");
        Receptionist r3 = new Receptionist("Lisa", 25000, "Female");

        employeeList.add(t1);
        employeeList.add(t2);
        employeeList.add(t3);
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(r1);
        employeeList.add(r2);
        employeeList.add(r3);
    }

    public static void add() {
        System.out.println("\nWhich occupation do you want to add? 1.Technician, 2.Programmer, 3.Receptionist");

        int yrke = input.nextInt();
        input.nextLine();
        System.out.println("Name?");
        String name = input.nextLine();

        System.out.println("Gender M/F?");
        String gender = input.nextLine();

        System.out.println("Salary?");
        int salary = input.nextInt();
        input.nextLine();

        switch (yrke) {
            case 1:
                Technician t = new Technician(name, salary, gender);
                employeeList.add(t);
                nrOfTechnician++;
                break;
            case 2:
                Programmer p = new Programmer(name, salary, gender);
                employeeList.add(p);
                nrOfProgrammer++;
                break;
            case 3:
                Receptionist r = new Receptionist(name, salary, gender);
                employeeList.add(r);
                nrOfReception++;
                break;
            default:
                break;
        }

    }

//    public static void removeByName() {
//        System.out.println("Enter name that you want to remove?");
//        String name = input.nextLine();
////        for (int i = employeeList.size() - 1; i >= 0; i--) {
////            if (employeeList.get(i).getName().equalsIgnoreCase(name)) {
////                employeeList.remove(i);
//            }
//    }
    public static void removeByName() {
        boolean removed = false;

        System.out.println("Enter the name of whom you want removed");
        String name = input.nextLine();

        System.out.println("Are you sure you want to remove " + name + "?\n1. Yes\n2. No");
        int reasure = input.nextInt();
        input.nextLine();

        if (reasure == 1) {

            for (Employee employee : employeeList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    employeeList.remove(employee);
                    System.out.println(name + " is now removed");
                    removed = true;
                    break;
                }
            }
            if (removed == false) {
                System.out.println("Error 404: " + name + " not found");
            }
        } else {
            System.out.println("The remove of " + name + " has been cancelled");
        }
    }

    public static void removeById() {
        boolean removed = false;
        System.out.println("Enter the ID of whom you want to remove?");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Are you sure you want to remove " + id + "?\n1. Yes\n2. No");
        int reasure = input.nextInt();

        if (reasure == 1) {

            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    employeeList.remove(employee);
                    System.out.println("Now id " + id + " is remove");
                    removed = true;
                    break;
                }
            }

            if (removed == false) {
                System.out.println("Error 404: " + id + " not found");
            }
        } else {
            System.out.println("The remove of " + id + " has been cancelled");
        }

    }
    //        for (int i = employeeList.size() - 1; i >= 0; i--) {
//            if (employeeList.get(i).getId() == id) {
//                employeeList.remove(i);
//            }
//        }

    public static void updateNameByName() {
        System.out.println("Which name that you want to update?");
        String name = input.nextLine();
        System.out.println("New name?");
        String newName = input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                employee.setName(newName);
                break;
            }
        }
    }

    public static void updateNameById() {
        System.out.println("Enter ID that you want to update name?");
        int id = input.nextInt();
        input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Do you want to update " + employee.getName());
                break;
            }
        }
        System.out.println("Enter new name?");
        String newName = input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employee.setName(newName);
            }
        }
    }

    public static void showInfobyId() {
        System.out.println("Which ID that you want to see info about?");
        int Id = input.nextInt();
        input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId() == Id) {
                System.out.println(employee + "\n");
                break;
            }
        }
    }

    public static void showInfobyName() {
        System.out.println("Enter name that you want to see info about?");
        String name = input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                System.out.println(employee + "\n");
                break;
            }
        }
    }

    public static void showInfoAboutAll() {
        System.out.println("\n" + "List over all employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee + "\n");
        }
    }
    
    public static void printAllSortByName(){
        Comparator<Employee> sortName = (o1,o2)-> o1.getName().compareTo(o2.getName());
        employeeList.sort(sortName);
        
        employeeList.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    
    public static void printAllSortById(){
        employeeList.sort((o1,o2)-> o1.getId()-(o2.getId()));
        for (Employee employee : employeeList) {
            System.out.println(employee);
            
        }
    }
    
    public static void printAllSortBySalary(){
        Comparator<Employee> sortBySalary = ((o1,o2)-> o1.getSalary()-o2.getSalary());
        employeeList.sort(sortBySalary);
        for (Employee employee : employeeList) {
            System.out.println(employee);
            
        }
    }

    public static void averageSalary() {
        int salarySum = 0;
        for (Employee employee : employeeList) {
            salarySum = employee.getSalary() + salarySum;

        }
        int averageSalary = salarySum / employeeList.size();
        System.out.println("Average salary over all employees is " + averageSalary + "\n");

    }

    public static void averageTechnicianSalary() {
        int technicianSalarySum = 0;

        for (Employee employee : employeeList) {
            if (employee instanceof Technician) {
                technicianSalarySum = employee.getSalary() + technicianSalarySum;

            }

        }
        int averageTechnicianSalary = technicianSalarySum / nrOfTechnician;

        System.out.println("Average salary over technicians is " + averageTechnicianSalary + "\n");

    }

    public static void averageProgrammerSalary() {
        int programmerSalarySum = 0;

        for (Employee employee : employeeList) {
            if (employee instanceof Programmer) {
                programmerSalarySum = employee.getSalary() + programmerSalarySum;
            }

        }
        int averageProgrammerSalary = programmerSalarySum / nrOfProgrammer;

        System.out.println("Average salary over pergrammer is " + averageProgrammerSalary + "\n");

    }

    public static void averageReceptionistSalary() {
        int receptionSalarySum = 0;

        for (Employee employee : employeeList) {
            if (employee instanceof Receptionist) {
                receptionSalarySum = employee.getSalary() + receptionSalarySum;
            }

        }
        int averageReceptionSalary = receptionSalarySum / nrOfReception;

        System.out.println("Average salary over receptionists is " + averageReceptionSalary + "\n");

    }

    public static void genderDistribution() {
        int male = 0;
        int female = 0;
        for (Employee employee : employeeList) {
            String gender = employee.getGender();
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("Male")) {
                male++;
            }
            if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("Female")) {
                female++;
            }
        }
        double total = male + female;

        double percentMale = (male / total) * 100;
        System.out.format("%.2f%s%n", percentMale, " percent of male");

//      double percentMale = (male / total) * 10000+0.5;
//      percentMale = (int) percentMale;
//      percentMale = (double) percentMale /100;
        double percentFemale = (female / total) * 100;
        System.out.format("%.2f%s%n", percentFemale, " percent of female" + "\n");

        //     double percentFemale = (male / total) * 10000+0.5;
//      percentFemale = (int) percentFemale;
//      percentFemale = (double) percentFemale/100;
    }

    public static void totalSalaryById() {
        System.out.println("Enter id of the person that you want to calculate salary ");
        int id = input.nextInt();
        input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Total salary for " + employee.getName() + " is " + (employee.totalSalary()) + "\n");
                break;
            }

        }
    }

    public static void totalSalaryByName() {
        System.out.println("Enter name of the person that you want to calculate salary");
        String name = input.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                System.out.println("Total salary for " + name + " " + "is " + (employee.bonus() + employee.getSalary()) + "\n");
            }
        }
    }

    public static int technicianBonusSum() {
        int technicianBonusSum = 0;
        for (Employee employee : employeeList) {
            if (employee instanceof Technician) {
                System.out.print(employee.getName() + " ");
                technicianBonusSum = technicianBonusSum + employee.bonus();
            }
        }
        System.out.println("Sum of technician bonus is " + technicianBonusSum + "\n");
        return technicianBonusSum;
    }

    public static int programmerBonusSum() {
        int programmerBonusSum = 0;
        for (Employee employee : employeeList) {
            if (employee instanceof Programmer) {
                System.out.print(employee.getName() + " ");
                programmerBonusSum = programmerBonusSum + employee.bonus();
            }
        }
        System.out.println("Sum of programmer bonus is " + programmerBonusSum + "\n");
        return programmerBonusSum;
    }

    public static int receptionistBonusSum() {
        int receptionistBonusSum = 0;
        for (Employee employee : employeeList) {
            if (employee instanceof Receptionist) {
                System.out.print(employee.getName() + " ");
                receptionistBonusSum = receptionistBonusSum + employee.bonus();
            }
        }
        System.out.println("Sum of receptionist bonus is " + receptionistBonusSum + "\n");
        return receptionistBonusSum;
    }

    public static int BonusSum() {
        int bonusSum = receptionistBonusSum() + programmerBonusSum() + technicianBonusSum();
        System.out.println("Total bonus over all employee is " + bonusSum + "\n");
        return bonusSum;
    }

    public static int highestSalary() {
        int highestSalary = employeeList.get(0).getSalary();

        for (Employee employee : employeeList) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
            }
        }
        System.out.println("The highest salary of all employees is " + highestSalary + "\n");
        return highestSalary;
    }

    public static int lowestSalary() {
        int lowestSalary = employeeList.get(0).getSalary();
        for (Employee employee : employeeList) {
            if (employee.getSalary() < lowestSalary) {
                lowestSalary = employee.getSalary();
            }

        }
        System.out.println("The lowest salary of all employees is " + lowestSalary + "\n");
        return lowestSalary;
    }
}
