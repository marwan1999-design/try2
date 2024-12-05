package finalprojectclone;

import java.util.LinkedList;

public class savedtaskclone extends LinkedList<Task2> {

	public void savedTask() {
		if(this.isEmpty()) {
			System.out.println("No task found");
		}
		while(!this.isEmpty()) {
		System.out.println(this);
		break;
		}
	}
	
	
	public void deleteAllCompletedtask() {
		if(this.isEmpty()) {
			System.out.println("No task found");
		}
		while(!this.isEmpty()) {
		System.out.println("All tasked removed "+ this.removeAll(this));
		break;
		}
	}

}
