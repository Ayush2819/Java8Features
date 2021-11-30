package newfeatures;



import java.util.Base64;
import java.util.Scanner;



// java program to encrypt & decrypt
public class Base64Demo {



public static void main(String[] args) {



Scanner s = new Scanner(System.in);

String username, password;

System.out.println("*******Welcome to coforge technologies********");
System.out.println("Enter your Name");

username = s.next();
System.out.println("Enter your password:");

password = s.next();

//Encoding the string to base64
String encodedpassword = Base64.getEncoder().encodeToString(password.getBytes());

System.out.println("Login successfully!!!!");
System.out.println("User Name:" + username);
System.out.println("Password" +encodedpassword);

System.out.println("*****Decrypt the pasword*****");

//decode Base64 format to byteaArray
String decodePassword = new String(Base64.getDecoder().decode(encodedpassword));
System.out.println("The password is: "+ decodePassword);
System.out.println("-------Url enoding------");


Base64.Encoder encoder= Base64.getUrlEncoder();
String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());

System.out.println("Encoded Url: "+eUrl);
}



}