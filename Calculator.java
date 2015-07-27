import java.util.Scanner;


public class Calculator {
			
	

	 
       public Calculator(){}// Empty constructor	
	
     
	// this method converts infix expression to postfix and evaluates the answer
  public void infixtopost(String infixExpression){
	  
	  
	  Stack<Character> newstack = new Stack<Character>();
	  
	  
	  String postfixExpression = "";
	  
	  
	  // this for loop goes to each and every characeter in string 
	  // for different characters it has certain tasks to go through  
	  for(int i = 0 ; i< infixExpression.length(); i++){
		  
	  char character = infixExpression.charAt(i);
	
	  if (character == '('){
		  newstack.push(character);
	  }
	  else if (Character.isDigit(character) && Character.isDigit(infixExpression.charAt(i+1))){
		  
		  postfixExpression = postfixExpression + character + infixExpression.charAt(i+1) + " " ;
	  }
	  else  if ( Character.isDigit(character) && Character.isDigit(infixExpression.charAt(i-1))){
			  postfixExpression =  postfixExpression ;
    	}
	  else if (Character.isDigit(character) && !Character.isDigit(infixExpression.charAt(i+1))){
		  postfixExpression =  postfixExpression + character + " ";
	  }
	   else if (character == '+' || character == '-' || character == '/' || character == '*'){
		
	   	   if (newstack.isEmpty()) 
		    	newstack.push(character);
		  
		  else if (newstack.peek().equals('('))
			   newstack.push(character);
	  
	      else if(precedence1(newstack.peek(),character))
			  newstack.push(character);
		  
		  else if(precedence(newstack.peek(), character))
			  newstack.pop();
		    
	 }
		  else if (character == ')'){
		
		  while(!newstack.peek().equals('(')){
					postfixExpression = postfixExpression + newstack.peek()+" ";
				
				  newstack.pop();
			  }
			 
			  
		  }
	  
	  else{}
  }//for loop ends here
	
  while(!newstack.isEmpty()){ //this while loop pops and prints the remaining in the stack
		
	  postfixExpression = postfixExpression + newstack.peek()+ "";  
		  newstack.pop(); 
	
  }
	 
  postfixExpression = postfixExpression.replace("(","");
  
  System.out.println(" Post fix for equation is : " +postfixExpression);

  
///////////////////////////////evaluating post fix method starts from here   ///////////////
	
	Stack<Integer> newstack2= new Stack<Integer>(); // new stack for math operations
		
		int v1 = 0,
		v2 = 0,
		finalvalue = 0;
		
		// for loop to evaluate values of postfix
		for (int i= 0 ; i< postfixExpression.length(); i++){
			char character = postfixExpression.charAt(i);
		   
			
			if (Character.isDigit(character) && Character.isDigit(postfixExpression.charAt(i+1))){
				
				String s = ""+character + postfixExpression.charAt(i+1) ;
				int f = Integer.parseInt(s);
				
				newstack2.push(f);
				s = "";
            
			}else if(Character.isDigit(character) && !Character.isDigit(postfixExpression.charAt(i+1))){
				String s ="" + character  ;
				int f = Integer.parseInt(s);
				
				newstack2.push(f);
				s = "";
			}
			
			
			
			else if (character == '+' || character == '-' || character == '/' || character == '*'){
             v1= newstack2.pop();
             v2= newstack2.pop();
             if (character == '+'){
             finalvalue = v1+v2;
             newstack2.push(finalvalue);
             } else if (character == '-'){
          finalvalue = v1-v2;
          newstack2.push(finalvalue);
             } else if(character == '*'){
          finalvalue = v1*v2;
          newstack2.push(finalvalue);
             } else if(character == '/'){
          finalvalue = v1/v2;
          newstack2.push(finalvalue);
			}
			}
			else if (character == '('){}
		
		}
		// prints the resulit of evaluating
		System.out.println ("After evaluating postfix function answer is " + newstack2.peek());
}
	//end method
  
  

  
  
	
	  
	  
	  
	  

	  
	  
	  
  

  
  
  
  
  
  
  public static  char operator1(char el){
	  if (el == '+' || el =='-' || el =='*'||el == '/'){
		  return el;
	  }else
		  return el;
  }
  public static char operand(char el){
	if ( Character.isDigit(el))
		return el;
	else 
		return el;
	  
  }
  
  
  
  public static int operator(char el){
	switch (el){
	case '+': return 1;
	case '-': return 1;
	case '*': return 2;
	case '/': return 2;
	case '(': return -1;
	default: return 0;
	}
	}
public static boolean precedence( char el, char dl)
{ return (operator(el) > operator(dl));
	}
public  static boolean precedence1( char el, char dl)
{ return (operator(el) < operator(dl));
	}
}


