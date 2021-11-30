package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Creating Consumer Action
public class ForEachDemo1 {
	
	public static void main(String [] args) {
		
	List<String> names=Arrays.asList("john","Mike","Alex");	
	
	Consumer<String> convertUpperCase=new Consumer<String>()
			{

				@Override
				public void accept(String t) {
					// TODO Auto-generated method stub
					System.out.println(t.toUpperCase());
				}
		
			};
			names.forEach(convertUpperCase);
			
			// Consumer to display a Number
			Consumer<Integer> display=a-> System.out.println(a);
			
			//implement display using accept
			display.accept(10);
	}}
