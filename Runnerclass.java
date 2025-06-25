package task2;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Runnerclass {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Students> listOfStudents = new ArrayList<>();
	public static void main(String[] args) {
		String operation;
		String id;
		String name;
		int mark;
		int index = 0;
	
		
		boolean notexit=true;
		
		while(notexit) {
			out.println("Enter the operation to do");
			out.println("1. Add");
			out.println("2, Update");
			out.println("3, veiw");
			out.println("4. Delete");
			operation = scanner.nextLine();
			
			
			switch(operation) {
				
				case "1":
					out.println("Enter Student id");
					id = scanner.nextLine();
					out.println("Enter Student name");
					name = scanner.nextLine();
					out.println("Enter Student mark");
					mark = Integer.parseInt(scanner.nextLine());
					
					addStudent(new Students(id,name,mark));
					break;

				case "2":
					out.println("size of list: "+listOfStudents.size());
					out.println("Enter Student id");
					id = scanner.nextLine();
					out.println("Enter Student name");
					name = scanner.nextLine();
					out.println("Enter Student mark");
					mark = Integer.parseInt(scanner.nextLine());
					out.println("Enter index to update");
					index = Integer.parseInt(scanner.nextLine());
					
					updateStudent(new Students(id,name,mark),index-1);
					break;
			      
				case "3":
					showAllstudets();
					break;
					
				case "4":
			
					out.println("size of list: "+listOfStudents.size());
					out.println("Enter index to delete");
					index = Integer.parseInt(scanner.nextLine());
					delteStudent(index-1);
			}
			
			
			
			
			
		}
		

	}
	private static void showAllstudets() {
		for(Students student:listOfStudents) {
			out.println();
			
			out.println(student);
			
		}
		
	}
	private static void delteStudent(int index) {
		
		out.println("succesfully deleted: "+listOfStudents.get(index));
		listOfStudents.remove(index);
		
		
	}
	private static void updateStudent(Students students, int index) {
		// TODO Auto-generated method stub
		listOfStudents.set(index, students);
		out.println("succesfully updated: "+ students +" at "+index);
	}
	private static void addStudent(Students student) {
		// TODO Auto-generated method stub
		listOfStudents.add(student);
		out.println("succesfully added: "+student);
	}

}
