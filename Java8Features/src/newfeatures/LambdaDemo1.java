package newfeatures;

interface MyFi
{
	public String sayHello(); //Abstract method
	// it will run only one method, if there are more than one method it will give an error
	}
	public class LambdaDemo1 {

	public static void main(String[] args) {
		
		MyFi msg= () ->
		{
			return "Hello World";
		};
		
		System.out.println(msg.sayHello());
	}

}
