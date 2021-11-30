package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 * 

Java lambda expression can be used in the collection framework. 
It provides efficient and concise way to iterate, filter and fetch data.


 */

public class LambdaComparatorDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Gosling",78);
		Student s2 = new Student(102, "Rod johnson",56);
		Student s3 = new Student(103, "Steve Jobs",95);
		Student s4 = new Student(104, "Zuckerberg",82);
		Student s5 = new Student(105, "Mike",72);

		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		System.out.println("Sort student based on names :" );
		
		// implementing Lambda Expressions to sort user defined objects using Comparator interface
		// Comparator interface's compareTo() method
		
		Collections.sort(sList,(st1,st2)->{
			return st1.name.compareTo(st2.name);
		});
		
		for(Student s:sList)
		{
			System.out.println(s.rollNumber+ " "+ s.name+ " "+s.marks);
			
		}
		
		// Sort in descending order based on marks of students
		
		System.out.println("***Descending order of marks***");
		
		Collections.sort(sList,(st1,st2)->{
			return st2.marks.compareTo(st1.marks);
		});
		//foreach() loop
		sList.forEach(s->System.out.println(s.rollNumber+" "+s.name+" "+s.marks));
	}

}
