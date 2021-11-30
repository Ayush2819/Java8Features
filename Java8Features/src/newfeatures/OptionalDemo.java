package newfeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
	/*	String s = null;
		Integer a =null;
		
		System.out.println(s.length());*/ // throws Null Pointer Exception
		
		String s= null;
		Optional<String> chkNull=Optional.ofNullable(s);

		if(chkNull.isPresent())
		{
			System.out.println("Length of String is: "+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
		}
		else
		{
			System.out.println("String not present");
		}
		
	}

}
