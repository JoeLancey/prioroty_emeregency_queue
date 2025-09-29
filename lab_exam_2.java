package queue;
import java.util.*;


public class lab_exam_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmergencyRoomQueue erQueue = new EmergencyRoomQueue();

        boolean running = true;
        while (running) {
            System.out.println("\n--- EMERGENCY SYSTEM ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Display patient");
            System.out.println("3. Treat Next Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

           if (choice == 1) {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter priority "
                    		+ "\n1 Critical"
                    		+ "\n2 Serious"
                    		+ "\n3 Stable "
                    		+ "\n4 Minor ");                  
                    int priority = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter patient condition: ");
                    String condition = scanner.nextLine();

                    System.out.print("Enter arrival time (Hour: Minutes): ");
                    String time = scanner.nextLine();

                    erQueue.addPatient(name, priority, condition, time);
                    break;

           }
          else if (choice == 2) {
                    erQueue.displayQueue();
                    break;
          }
          else if (choice == 3) {  
        	  System.out.println("\n=== PATIENTS LIST ===");
                    erQueue.treatNextPatient();
                    break;
          }
          else if (choice == 3) {  
                    running = false;
                    System.out.println("Bye");
                    break;
          }
          else {
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}








