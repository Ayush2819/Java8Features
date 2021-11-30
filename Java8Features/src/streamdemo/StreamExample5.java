package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class StreamExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iterate -- used to define infinite sequential stream
		Stream<Integer> evenInfiniteStream=Stream.iterate(0, n -> n+2);
		
		List<Integer> evenList= evenInfiniteStream.limit(10).collect(Collectors.toList());
		
		System.out.println("Even No.s with Limit 20 ");
		System.out.println(evenList);
		
		System.out.println("************");
		Stream<Integer> oddInfiniteStream=Stream.iterate(1, n->n+2);
		//Converting stream to set
		Set<Integer> oddList=oddInfiniteStream.limit(20).collect(Collectors.toSet());
		
		System.out.println("Set woth Odd Nos with Limit 20");
		System.out.println(oddList);
		
		//Distinct - filter unique element
		List<String> desig=Arrays.asList("Manager","Technician", "Salesman","Developer","Manager" );
		List<String> distinctDesig=desig.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctDesig);
		
		//skip() - skip first n elements
		Stream<Integer> evenInfiniteStream1=Stream.iterate(0, n -> n+2);
		
		List<Integer> evenList1= evenInfiniteStream1.skip(5).limit(20).collect(Collectors.toList());
		
		System.out.println("List Even No.s with skip first 5 elements Limit 20 ");
		System.out.println(evenList1);
		
		//anyMatch()
		boolean match=desig.stream().anyMatch(s->s.contains("Developer"));
		System.out.println("Developer exists or not: ?" + match);
		
	
	}

}
