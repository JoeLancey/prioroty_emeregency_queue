package queue;

import java.util.Scanner;

public class lab_exam_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        emergency_room erQueue = new emergency_room();

        boolean running = true;
        while (running) {
            System.out.println("\n--- EMERGENCY SYSTEM ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Display patients");
            System.out.println("3. Treat Next Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number 1 to 4.");
                scanner.next(); 
                continue;
            }
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter priority"
                            + "\n1 Critical"
                            + "\n2 Serious"
                            + "\n3 Stable"
                            + "\n4 Minor"
                            + "\nChoice: ");
                    int priority = -1;
                    if (scanner.hasNextInt()) {
                        priority = scanner.nextInt();
                    } else {
                        System.out.println("Invalid priority. Use integer 1–4.");
                        scanner.next(); 
                        break;
                    }
                    scanner.nextLine(); 

                    System.out.print("Enter patient condition: ");
                    String condition = scanner.nextLine();

                    System.out.print("Enter arrival time (HH:MM): ");
                    String time = scanner.nextLine();

                    erQueue.addPatient(name, priority, condition, time);
                    System.out.println("Patient added.");
                    break;

                case 2:
                    erQueue.displayQueue();
                    break;

                case 3:
                    System.out.println("\n=== TREATING NEXT PATIENT ===");
                    erQueue.treatNextPatient();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
