package controller;

import controller.StaffManagers;
import model.FullTimeStaff;
import model.PartTimeStaff;
import model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerformFunction {
    List<Staff> employees = new ArrayList<>();
    StaffManagers staffManagers = new StaffManagers(employees);
    Scanner input = new Scanner(System.in);
    public void choose(int numberChoose) {
        switch (numberChoose) {
            case 1 -> addNewFullTimeStaff();
            case 2 -> addNewPartTimeStaff();
            case 3 -> editFullTimeStaff();
            case 4 -> editPartTimeStaff();
            case 5 -> deleteStaff();
            case 6 -> printStaffList();
            case 7 -> System.out.println("\nAverage salary of employees: " +
                                            staffManagers.getAverageSalary());
            case 8 -> System.out.println("\nEmployees whose wages are lower than the median salary are: " +
                                            staffManagers.listedStaff());
            case 9 -> System.out.println("The salary payable to all part-time employees is" +
                                            staffManagers.getTotalSalary());
            case 10 -> System.out.println(staffManagers.sortHardSalary());
            case 0 -> System.exit(numberChoose);
            default -> System.out.println("Please choose again!");
        }
    }
    public int enterStaffCode() {
        System.out.print("Enter employee code: ");
        return input.nextInt();
    }
    public String enterFullName() {
        input.nextLine();
        System.out.print("Enter first and last name: ");
        return input.nextLine();
    }
    public int enterAge() {
        System.out.print("Enter age: ");
        return input.nextInt();
    }
    public int enterPhoneNumber() {
        System.out.print("Enter phone number: ");
        return input.nextInt();
    }
    public String enterEmail() {
        input.nextLine();
        System.out.print("Enter email: ");
        return input.nextLine();
    }
    public int enterReward() {
        System.out.print("Enter the employee's bonus amount: ");
        return input.nextInt();
    }
    public int enterFine() {
        System.out.print("Enter the amount of the employee's fine: ");
        return input.nextInt();
    }
    public int enterHardSalary() {
        System.out.print("Enter the employee's fixed salary: ");
        return input.nextInt();
    }
    public int enterHour() {
        System.out.print("Enter the number of hours the part-time employee works: ");
        return input.nextInt();
    }
    public void addNewFullTimeStaff() {
        staffManagers.addStaff(new FullTimeStaff(enterStaffCode(), enterFullName(), enterAge(),
                                    enterPhoneNumber(), enterEmail(), enterReward(),
                                    enterFine(), enterHardSalary()));
    }
    public void addNewPartTimeStaff() {
        staffManagers.addStaff(new PartTimeStaff(enterStaffCode(), enterFullName(), enterAge(),
                                    enterPhoneNumber(), enterEmail(), enterHour()));
    }
    public int enterIndex() {
        System.out.print("Enter index: ");
        return input.nextInt();
    }
    public void editFullTimeStaff() {
        staffManagers.editStaff(enterIndex(), new FullTimeStaff(enterStaffCode(), enterFullName(),
                                    enterAge(), enterPhoneNumber(), enterEmail(),
                                    enterReward(), enterFine(), enterHardSalary()));
        System.out.println("List of employees after editing: ");
        printStaffList();
    }
    public void editPartTimeStaff() {
        staffManagers.editStaff(enterIndex(), new PartTimeStaff(enterStaffCode(), enterFullName(),
                                    enterAge(), enterPhoneNumber(), enterEmail(), enterHour()));
        System.out.println("List of employees after editing: ");
        printStaffList();
    }
    public void printStaffList() {
        for (Staff employee : employees) {
            System.out.println(employee);
        }
    }
    public void deleteStaff() {
        System.out.println("List of employees after deletion: ");
        printStaffList();
    }
}
