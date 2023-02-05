package views;

import controller.PerformFunction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Manager manager = new Manager();
        int numberChoose;
        do {
            System.out.println("""
                    
                    Menu:
                        1. Add a new Full-time employee.
                        2. Add a new Part-time employee.
                        3. Edit an other Full-time employee.
                        4. Edit an other Part-time employee.
                        5. Delete staff.
                        6. Show staff list.
                        7. Average salary of employees.
                        8. List of full-time employees who earn less than average salary.
                        9. Amount of wages payable to all part-time employees.
                        10. Sort full-time employees by salary ascending.
                        0. Exit.""");
            try {
                System.out.print("Enter choose of you: ");
                numberChoose = input.nextInt();
                manager.function.choose(numberChoose);
            } catch(InputMismatchException e) {
                System.err.println("Error! An error occurred. Please try again later!");
                System.exit(0);
            }

        } while (true);
    }

    public PerformFunction function = new PerformFunction();

}