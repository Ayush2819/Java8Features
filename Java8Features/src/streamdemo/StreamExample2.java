package streamdemo;

import java.util.*;
import java.util.stream.*;

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("John","Dan","Mike","Thomsan");
		
		//Create a stream
		Stream<String> n=names.stream();

			//Intermediate Operations
		Stream<String> ln=n.filter(str->str.length()>3);
		
		ln.forEach(System.out::println);
		
		System.out.println("************");
		List<String> names1=names.stream().filter(str->str.length()>4).collect(Collectors.toList());
		System.out.println(names1);
		
	}
	

}
