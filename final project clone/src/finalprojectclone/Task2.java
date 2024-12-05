package finalprojectclone;

import java.util.*;

class Task2Comparator implements Comparator<Task2> {
	public int compare(Task2 s1, Task2 s2) {
		if (s1.getLevelofImportant() < s2.getLevelofImportant())
			return 1;
		else if (s1.getLevelofImportant() > s2.getLevelofImportant())
			return -1;
		return 0;
	}
}

class Task2 implements Comparable<Task2>{

	private String task;
	private int levelofImportant;
	private int id;

	public Task2() {
		task = "";
		levelofImportant = 0;
		id = 0;
	}
	@Override
	public int compareTo(Task2 o) {
        return Integer.compare(this.levelofImportant, o.levelofImportant); // Compare by priority
	}

	// A parameterized Task constructor
	public Task2(String task, int levelofImportant, int id) {
		this.task = task;
		this.setLevelofImportant(levelofImportant);
		this.id = id++;
	}

	public String toString() {

		return "Task {" + "id ='" + id + " task='" + task + '\'' + ", levelofImportant = " + getLevelofImportant() + '}'
				+ "\n";
	}

	public int getLevelofImportant() {
		return levelofImportant;
	}

	public void setLevelofImportant(int levelofImportant) {
		this.levelofImportant = levelofImportant;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// method to view incomplete task
	public void ViewIncompletedTasks(PriorityQueue<Task2> pq) {
		
		if (pq.isEmpty()) {
			System.out.println("No task found");
		}
		
		/*Set<Task2> set = new HashSet<>(pq);
		System.out.println(set);*/
		
	   while (!pq.isEmpty()) {

		List<Task2> sorted = new ArrayList<>(pq);
		Collections.sort((sorted));
		
		System.out.println(sorted);
		
		break;}
		
		
	
	}

	// method to add a task
	public Task2 addTask(Scanner n) {//, PriorityQueue<Task2> pq) {
		Task2 taskadded;
		int levelofImportant;
		int min = 1;
		int max = 3;
		System.out.println("Add task name:");
		String task = n.nextLine();
		System.out.println("choose 1 for high priority, 2 for medium, 3 for low");

		while (true) {
			levelofImportant = -1;
			if (!n.hasNextInt()) {
				System.out.println("invalid input, only integer from 1 -3 are allowed");
				n.nextLine();
			} else {
				levelofImportant = n.nextInt();
				if (levelofImportant > min || levelofImportant < max) {
					System.out.println("Number is out of range");
					break;
				}
			}
		}
		//int levelofImportant = n.nextInt();

		int id = this.id++;
		taskadded = new Task2(task, levelofImportant, id);
		System.out.println("task added successfully");

		//pq.add(taskadded);
		return taskadded;
		// return pq;

	}

	// method to delete a task
	public void deletetask(Scanner in, PriorityQueue<Task2> pq, savedtaskclone tempQueue) {
		if (pq.isEmpty()) {

			System.out.println("No task found");
		}

		while (!pq.isEmpty()) {
			List<Task2> sorted = new ArrayList<>(pq);
			Collections.sort((sorted));
			System.out.println(sorted);
			System.out.println("enter task ID to complete: ");
			while (!in.hasNextInt()) {
				System.out.println("invalid input, only integer are allowed");
				in.next();

			}
			/*int[]arr;
			int target;
			for (int i = 0; i < sorted.length; i++) {
		        if (arr[i] == target) {
		            return i; // Return the index of the element
		        }
		    }*/
			
			int taskId = in.nextInt();
			for (Task2 task : pq) {
				if (task.id == taskId) {
					tempQueue.add(task);
					pq.remove(task);
					System.out.println("task deleted");

				}else{
					System.out.println("ID Not found");
				}
			}
			break;
			// System.out.println("temp: " + tempQueue);
			// System.out.println("pq :" + pq);
			// tempQueue.savedTask();
		}
	}

	public void deleteAllIncompleteTasks(PriorityQueue<Task2> pq) {
		if (pq.isEmpty()) {

			System.out.println("No task found");
		}
		while (!pq.isEmpty()) {
			pq.clear();
			System.out.println("All tasked cleared");
			break;
		}

	}

	

	/*
	 * public String addtask(Scanner n, PriorityQueue<Task2> pq) {
	 * System.out.println("Add task name:"); String task = n.nextLine();
	 * System.out.println("choose 1 for high priority, 2 for medium, 3 for low");
	 * int levelofImportant = n.nextInt(); int id = this.id++; String taskadded =
	 * (task+ levelofImportant+ id); System.out.println(taskadded.toString());
	 * return taskadded; }
	 */

//	if(!n.hasNextInt() || !n.hasNextInt()) {
	/*
	 * while(true) { if(n.hasNextInt()) { int levelofImportant = n.nextInt();
	 * 
	 * if(levelofImportant >= min && levelofImportant <= max) { break; }else {
	 * System.out.println("Number is out of range"); //n.next(); n.nextLine();
	 * 
	 * }
	 * 
	 * }else {
	 * System.out.println("invalid input, only integer from 1 -3 are allowed");
	 * n.next(); }
	 */
	
	
	// voiw task not working method 
	
	/*	Object[] array = pq.toArray();
	Arrays.sort(array);
	
	for (Object element : array) {
	    System.out.println(element); // Output: 1, 2, 3, 4
	}  */

	
	
/*	Task2[] array = pq.toArray(new Task2[0]);
	ArrayList<Task2> list = ArraysList<Task2>.toList(array);
	Collections.sort(list, new Task2Comparator()); */
	
	
	// Arrays.toString(pq.toArray());
	
	
	
/*	System.out.println("tasks served in their priority order:");
	System.out.println(pq.size());
    System.out.println(pq);*/
    
    
//    System.out.println(Arrays.toString(pq.toArray()));
  //  System.out.println(pq.poll());

    
  //  Arrays.sort(pq, Array.toString(pq.add(this)));
	
	
	
/*	while (!pq.isEmpty()) {
		System.out.println("tasks served in their priority order:");
		 System.out.println("priority Queue"+pq.toString());
		System.out.println(pq.poll());
		 break;
	}  */


}
