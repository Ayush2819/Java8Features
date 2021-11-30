package newfeatures;

// MEthod Reference - Shorthand of lambda expression to call method

interface MyInterface{

	void myMethod();
	
}
class Test // instance class
{
	void display()  // instance method 
	{
		System.out.println("I'm a instance method");
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		//traditional approach
		Test t1 = new Test();
		t1.display();
		
		//java8 method reference approach
		MyInterface m1ref=t1::display;
		m1ref.myMethod();
	
	}

}
