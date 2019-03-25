package staffmanagemant;

import java.util.Scanner;

public class StaffManagement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        EmployeeManagement.add3OfEachOccupation();

        

      menu();

    } 
    

    public static void menu() {
        boolean loop = true;
        do {
            System.out.println("\n" + "1.EmployeeManagement 2.Statistic 0.Exit program?");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    employeeManagementMenu();
                    break;
                case 2:
                    employeeStatisticsMenu();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    loop = false;
                    break;
            }
        } while (loop == true);
    }

    public static void employeeManagementMenu() {
        boolean loop = true;
        int choice;
        do {
            System.out.println("\n" + " 1.Add\n 2.Remove by name\n 3.Remove by id\n 4.Update by name\n "
                    + "5.Update by id\n 6.Showinfo by id\n 7.Showinfo by name\n 8.Show all info\n "
                    + "9.Calculate total salary by id\n 10.Calculate total salary by name\n" + "11.Print all employees sort by name\n"
                    + "12.Print all employees sort by id\n" + "13.Print all employees sort by salary\n" + "0.Back to main menu");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    EmployeeManagement.add();
                    break;
                case 2:
                    EmployeeManagement.removeByName();
                    break;
                case 3:
                    EmployeeManagement.removeById();
                    break;
                case 4:
                    EmployeeManagement.updateNameByName();
                    break;
                case 5:
                    EmployeeManagement.updateNameById();
                    break;
                case 6:
                    EmployeeManagement.showInfobyId();
                    break;
                case 7:
                    EmployeeManagement.showInfobyName();
                    break;
                case 8:
                    EmployeeManagement.showInfoAboutAll();
                    break;
                case 9:
                    EmployeeManagement.totalSalaryById();
                    break;
                case 10:
                    EmployeeManagement.totalSalaryByName();
                    break;
                case 11:
                    EmployeeManagement.printAllSortByName();
                    break;
                case 12:
                    EmployeeManagement.printAllSortById();
                    break;
                case 13:
                    EmployeeManagement.printAllSortBySalary();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;

            }

        } while (loop == true);

    }

    public static void employeeStatisticsMenu() {
        boolean loop = true;
        int choice;
        do {
            System.out.println("\n" + " 1.Average salary\n 2.Average technician salary\n 3.Average programmer salary\n"
                    + " 4.Average receptionist salary\n 5.Gender distribution\n 6.Technician total bonus\n 7.Programmer total bonus\n"
                    + " 8.Reception total bonus\n 9.Total bonus over all employees\n 10.Highest base salary\n"
                    + " 11.Lowest base salary\n 0.back to main menu ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    EmployeeManagement.averageSalary();
                    break;
                case 2:
                    EmployeeManagement.averageTechnicianSalary();
                    break;
                case 3:
                    EmployeeManagement.averageProgrammerSalary();
                    break;
                case 4:
                    EmployeeManagement.averageReceptionistSalary();
                    break;
                case 5:
                    EmployeeManagement.genderDistribution();
                    break;
                case 6:
                    EmployeeManagement.technicianBonusSum();
                    break;
                case 7:
                    EmployeeManagement.programmerBonusSum();
                    break;
                case 8:
                    EmployeeManagement.receptionistBonusSum();
                    break;
                case 9:
                    EmployeeManagement.BonusSum();
                    break;
                case 10:
                    System.out.println(EmployeeManagement.highestSalary());
                    break;
                case 11:
                    System.out.println(EmployeeManagement.lowestSalary());
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong input");

            }

        } while (loop == true);

    }
}
