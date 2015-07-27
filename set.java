import java.util.Scanner;
import java.util.ArrayList;

public class Set {             // this class is the list that will pop everytime to ask you want to do

		public void command() {
			System.out.println( "Please choose from on of the following");
			System.out.println( "1 Create a set.");
			System.out.println( "2 Print the list of created sets.");
			System.out.println( "3 Print a set");
			System.out.println( "4 Union");
			System.out.println( "5 Intersection");
			System.out.println( "6 Subtraction");
			System.out.println( "7 Exit");
			
		
		}
	
	// These lines are naming the arrays that will be used in the program 
	Scanner input = new Scanner (System.in);
	String name;
	static ArrayList <Integer> array; 
	static ArrayList<ArrayList> outterarray = new ArrayList<ArrayList>();
	static ArrayList<String> namearray = new ArrayList<String>();
	
	public void Create() { // this method creates the sets for the user
		array = new ArrayList<Integer>();
		System.out.println("Please enter a name:");
		String inputName = input.nextLine();
		namearray.add(inputName);
				
		System.out.println ("Please enter the numbers you would like in the set. Enter -1 when done");
		int in = input.nextInt();
		outterarray.add(array);
	
		
		while (in != -1){
			array.add(in);
			in = input.nextInt();
		
			
		}
		
	}
	
	public void printSet(){ // this method print the set when the user asks 
		String x = input.nextLine();
		int index=0;
		int i;
		for (i = 0; i< namearray.size(); i++ ){
			if(namearray.get(i).equals(x)){
				index = i;
				break;
			}
		}
			
		System.out.println(outterarray.get(index));
	}
	public void union(){ // this method is used if the user was to do the union operation on the sets 
    	
  	  System.out.println("Enter the name of the first set to union with : ");
  	  String first = input.nextLine();
  	 	
  		int index = 0 ;
  		for (int i = 0; i< namearray.size();i++){
  			
  			if (namearray.get(i).equals(first)){
  				index = i;
  		break;
  			    }
  			}
  	    ArrayList<Integer> list1= new ArrayList<Integer>(outterarray.get(index));
    
	  System.out.println("Enter the name of second set that you want to union");
	  String second = input.nextLine();
	 	
	
		for (int i = 0; i< namearray.size();i++){
			
			if (namearray.get(i).equals(second)){
				index = i;
		break;
			    }
			}
	    
	  int x = 0;
		ArrayList<Integer> list2= new ArrayList<Integer>(outterarray.get(x));
		if (list1.size() >= list2.size() ){  
			list1.addAll(list2);
			for (int i = 1; i<list1.size(); i++){
				int x1 = list1.get(i);
				int x2 = list1.get(i-1);
				if (x1 == x2){
					list2.remove(x1);
				}
			}
			System.out.println("When you union the two sets te result is : "+ list1);
		}
		else {  
			list2.addAll(list1);
			for (int i = 1; i<list2.size(); i++){
				int x3 = list2.get(i);
				int x4 = list2.get(i-1);
				if (x3 == x4){
					list1.remove(x3);
		  }
	  }
	  System.out.println("When you union of two sets the result is : "+ list2);
    }
    }

     public void intersection(){  // this method is used if the user was to do the intersection operation on the sets
    	
  	  System.out.println("Enter the name of the first set that you want to intersect : ");
  	  String first = input.nextLine();
  	 	
  		int index = 0 ;
  		int i;
  		for (i = 0; i< namearray.size();i++){
  			
  			if (namearray.get(i).equals(first)){
  				index = i;
  		break;
  			    }
  			}
  	    
  	 ArrayList<Integer> list3= new ArrayList<Integer>(outterarray.get(index));
    
	  System.out.println("Enter the name of second set that you want to intersect");
	  String second = input.nextLine();
	 	
		int x = 0 ;
		
		for ( i = 0; i< namearray.size();i++){
			
			if (namearray.get(i).equals(second)){
				index = i;
		break;
			    }
			}
	 
	  
			ArrayList<Integer> list4= new ArrayList<Integer>(outterarray.get(x));

			if (list3.size() >= list4.size() ){  
				list3.retainAll(list4);
				for (int a = 1; a<list3.size(); a++){
					int x1 = list3.get(a);
					int x2 = list3.get(a-1);
					if (x1 == x2){
						list3.remove(x1);
					} }
System.out.println("When you intersect the two sets the result is : "+ list3);
    }
else {  
	  list4.retainAll(list3);
	  for (int a = 1; a<list4.size(); a++){
		  int x1 = list4.get(a);
		  int x2 = list4.get(a-1);
		  if (x1 == x2){
			  list4.remove(x1);
		  } 
	  System.out.println("When you intersect the two sets the result is : "+ list4);
	  }
    }
    }
    
      public void subtraction(){  // this method is used if the user was to do the subtract operation on the sets
    	
  	  System.out.println("Enter the name of the first set you want to subtract: ");
  	  String first = input.nextLine();
  	 	
  		int index = 0 ;
  		int i;
  		for (i = 0; i< namearray.size();i++){
  			
  			if (namearray.get(i).equals(first)){
  				index = i;
  		break;
  			    }
  			}
  	    
  	  
    ArrayList<Integer> list5= new ArrayList<Integer>(outterarray.get(index));
    
	  System.out.println("Enter the name of second set you want to subtract");
	  String second = input.nextLine();
	 	
		int x = 0 ;
		int a;
		for (a = 0; a< namearray.size();a++){
			
			if (namearray.get(i).equals(second)){
				index = a;
		break;
			    }
			}
	      ArrayList<Integer> list6= new ArrayList<Integer>(outterarray.get(x));
	      if (list5.size() >= list6.size() ){  
	    	  list5.removeAll(list6);
	    	  for (int b = 1; b<list5.size(); b++){
	    		  int x8 = list5.get(b);
	    		  int x9 = list5.get(b-1);
	    		  if (x8 == x9){
	    			  list5.remove(x8);
	    		  }}
System.out.println("When you subtract the two sets the result is : "+ list5);
	  }
else {  
	  list6.removeAll(list5);
	  for (int b = 1; b<list6.size(); b++){
		  int x10 = list6.get(b);
		  int x11= list6.get(b-1);
		  if (x10 == x11){
			  list6.remove(x10);
		  }  
	  System.out.println("When you subtract the two sets the result is : "+ list6);
    }
    }

    }}
	
	

