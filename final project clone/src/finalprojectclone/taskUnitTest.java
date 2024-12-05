package finalprojectclone;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import javafx.concurrent.Task;

class taskUnitTest {
	savedtaskclone tempQueue = new savedtaskclone();

 /* public void ViewIncompletedTasks(PriorityQueue<Task2> pq) {
		
		if (pq.isEmpty()) {
			System.out.println("No task found");
		}
		
		Set<Task2> set = new HashSet<>(pq);
		System.out.println(set);
		
	   while (!pq.isEmpty()) {

		List<Task2> sorted = new ArrayList<>(pq);
		Collections.sort((sorted));
		
		System.out.println(sorted);
		
		break;}
		
		
	
	} */

	@Test
	
	
	public void deleteAll() {
		PriorityQueue<Task2> pqtest = new PriorityQueue<Task2>(new Task2Comparator());

		Task2 task = new Task2();
        task.deleteAllIncompleteTasks(pqtest);
		assertTrue(pqtest.isEmpty());
		//assertEquals("", )
	}
	
@Test
	
	
	public void deleteAllCompletedtask() {
		//PriorityQueue<Task2> pqtest = new PriorityQueue<Task2>(new Task2Comparator());
		savedtaskclone tempQueue2 = new savedtaskclone();

		Task2 task = new Task2();
		tempQueue2.deleteAllCompletedtask();
		assertTrue(tempQueue2.isEmpty());
		//assertEquals("", )
	}
	@Test

	public void viewtask() {
		PriorityQueue<Task2> pq = new PriorityQueue<Task2>(new Task2Comparator());

		Task2 task = new Task2();
		
		task.ViewIncompletedTasks(pq);
		
		assertEquals(pq, task);


	}

	
	@Test
	public void addTask() {//Scanner n, PriorityQueue<Task2> pq) {
		Task2 task2 = new Task2("gym",2, 0);
		System.out.print(task2.getTask());
		assertEquals("Task {id ='0 task='gym', levelofImportant = 2}", task2);
	//	task.setId(1);
	//	assertEquals(task.getTask(),task.addTask(n, pq).getTask());
	//	PriorityQueue<Task2> pq = new PriorityQueue<Task2>(new Task2Comparator());
	//	Scanner n = n.nextLine();
		
		//Task2 task = task.addTask(n, pq);
		//Task2 taskadded = new Task2()
		
		//task.addTask(n, pq);
		
		
	}
	
	
	
	
//	public void myPublicMethod() {
//		Task2 task = new Task2(pq.toString());

//		assertEquals(pq.toString(), task.myPublicMethod(pq));
	//}

}
