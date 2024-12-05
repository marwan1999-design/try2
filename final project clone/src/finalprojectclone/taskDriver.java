package finalprojectclone;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class taskDriver {
	public static void main(String[] args) {

		// taskGUI.main(args); // Launches the GUI

		Scanner in = new Scanner(System.in);
		boolean done = false;
		PriorityQueue<Task2> pq = new PriorityQueue<Task2>(new Task2Comparator());
		savedtaskclone tempQueue = new savedtaskclone();
		LinkedList<Task2> savedtasks = new LinkedList<>();
		Task2 task = new Task2();
		// task.addTask(in);

		
		
		while (!done) {
			

			System.out.println("\n To Do List App: ");
			System.out.println("1. Add Task:");
			System.out.println("2. View Incompleted Tasks");
			System.out.println("3. Complete a Task: ");
			System.out.println("4. View Completed Tasks");
			System.out.println("5. Exit");
			System.out.println("8. Delete All Completed Tasks");
			System.out.println("9. Delete All Incomplete Task");
			System.out.println("Enter your choice: ");
			while(!in.hasNextInt()) {
				System.out.println("invalid choice, Only number are allwed");
				in.nextLine();
				//break;

			}
			int choice = in.nextInt();
			// int n = in.nextInt(); // Number of task
			in.nextLine();
			
			switch (choice) {
			case 1:
				// Task2 taskadded = task.addTask(in,pq);
				pq.add(task.addTask(in));
				// task.addTask(in, pq);
				break;

			case 2:
				task.ViewIncompletedTasks(pq);
				break;

			case 3:
				task.deletetask(in, pq, tempQueue);
				break;

			case 4:
				tempQueue.savedTask();

				break;

			case 5:
				System.out.println("Exiting...");
				done = true;
				break;

			case 8:
				tempQueue.deleteAllCompletedtask();
				break;

			case 9:
				task.deleteAllIncompleteTasks(pq);
				break;
			default:
				System.out.println("Invalid choice.");
			}
			
			
		}
		
		
		//while(choice.)
		in.close(); // Close the scanner
	}
}
