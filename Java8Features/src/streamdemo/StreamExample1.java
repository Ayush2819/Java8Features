package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;
public class StreamExample1 {

	public static void main(String[] args) {
		Integer [] marks = {45,44,23,54,65};
		
		//Build stream for arrays
		Stream<Integer> strm=Stream.of(marks);
		strm.forEach(i-> System.out.println(i));
		
		//Build stream from Collections
		List<Integer> grades =new ArrayList<Integer>();
		grades.add(10);
		grades.add(9);
		grades.add(5);
		grades.add(7);
		grades.add(6);
		grades.add(8);
		
		
		//Build streams from collections
		Stream<Integer> strm1=grades.stream();
		List<Integer> gradesEven=strm1.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);
		
		/*System.out.println("****ArrayList Contains****");
		
		strm1.forEach(System.out::println);
		
		List<Integer> squares=grades.stream().map(m->m*m).collect(Collectors.toList());
		System.out.println("******Double of grades******");
		System.out.println(squares);*/
		
	}
}
