package task2;

public class Students {
	
	
	// student fields
	private String id;
	private String name;
	private int marks;
	
	// constructor for assigning vale for student fields 
	public Students(String id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	// getters for student fields
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


}
