import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class Mainfile {

	
	public static void main (String[] args) throws IOException {
	String path = "/home/harsh/Desktop/conversion.txt"; // the conversion file with path from my computer
	FileReader file = new FileReader(path);
	BufferedReader test =new BufferedReader(file);
	String infix = test.readLine();
	 String infixExpression = infix;

	//////  below there is couple for loops to check the pranthesis
	  char s= '(';
	  char g = ')';
	  String dforopen = " ";
	  String dforclose = " ";
	  for  (int i=0 ; i< infixExpression.length();i++){
		 char f = infixExpression.charAt(i);
		  if (f == s){
			  dforopen= dforopen + f;
		  }
	  }
	  
	  for  (int i=0 ; i< infixExpression.length();i++){
			 char f = infixExpression.charAt(i);
			  if (f == g){
				  dforclose= dforclose + f;
			  }
		  }
	
	 int w = dforclose.length();
	 int r = dforopen.length();
	 if (w !=r){
		 System.out.println("Equation is imbalanced");
		 
	 }else {
		 System.out.println(" Equation is balanced");
		 Calculator cal = new Calculator(); 
		 cal.infixtopost(infixExpression);
	 }


	
	
	
	}

}
