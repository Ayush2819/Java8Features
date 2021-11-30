package newfeatures;

//pojo class
public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;

	
	
	public Student(int rollNumber, String name, double marks) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}



	public Integer getRollNumber() {
		return rollNumber;
	}



	public String getName() {
		return name;
	}



	public Double getMarks() {
		return marks;
	}

	
	
}
