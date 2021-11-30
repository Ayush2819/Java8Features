package newfeatures;

//block lambda expressions

public class LamdaDemo3 {

	public static void main(String[] args) {
		
		MyString reverseStr=(str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
				
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Exressions"));

	// lambda expression with single parameter
	MyString myname = (name) -> { return "Hello "+name;};
	System.out.println(myname.myStringFunction("Ayush"));
	
	// lambda expression with single parameter with no parameters
		MyString myname1 = name -> { return "Hello "+name;};
		System.out.println(myname1.myStringFunction("james gosling"));

	}}
