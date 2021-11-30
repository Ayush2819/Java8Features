package newfeatures;

interface Parser{



default void parse(){
System.out.println("default Parsing logic");
}

static void dispayDate() {
	System.out.println();
}
}

class TextParser implements Parser
{
	
}

class XMLParser implements Parser{
	public void parse() {
		System.out.println("Parsing XML Files");
	}
}
public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		Parser p = new TextParser();
		p.parse();
		
		p=new XMLParser();
		p.parse();

		
		System.out.println("Program executed at :");
	//	parse.displayDate();  //invoke static meyhod
	}

}
