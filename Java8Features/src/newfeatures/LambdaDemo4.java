/**
 * 
 */
package newfeatures;

/**
 * @author AYUSH MISHRA
 * 
 * Perform arithmetic operations using Lambda
 */
public class LambdaDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Addition op1 = (a,b) -> (a+b);
	System.out.println("Addition of 2 No.s is : "+ op1.calculate(200,150));
	
	Addition op2 = (a,b) -> (a-b);
	System.out.println("Subtraction of 2 No.s is : "+ op2.calculate(200,150));
	
	Addition op3 = (a,b) -> (a*b);
	System.out.println("Multiplication of 2 No.s is : "+ op3.calculate(200,150));

	Addition op4 = (a,b) -> (a/b);
	System.out.println("Division of 2 No.s is : "+ op4.calculate(200,150));

	MyString myname1 = name -> { return "Hello "+name;};
	System.out.println(myname1.myStringFunction("james gosling"));
	}

}
