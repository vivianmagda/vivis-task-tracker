import java.sql.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int taskId;
        String taskDescription, taskStatus;
        Date createdAt, updatedAt;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Vivis Task Tracker! What do you wanna do?");
        System.out.println("1. Add a task\n2. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        
        while (choice != 2){
            switch (choice) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.println("""
                        Tell me the ID, description and status of your new task: 

                        id: A unique identifier for the task
                        description: A short description of the task
                        status: The status of the task (todo, in-progress, done)

                    
                    """);
                    String task = scanner.nextLine();
                    System.out.println(task);
                    break;
                default:
                System.out.println("Not a valid choice! Please choose a valid operation. ");
                break;
            }

            System.out.println("\nWhat's next?");
            System.out.println("1. Add a task\n2. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()
           
        }

        System.out.println("\nThank you for using Vivis Task Tracker!");
        scanner.close();

    }
}