import java.util.Scanner;   //Scanner class to take input from user

public class ExceptionDemo {    //class with main method to show demo of
	
	public static void main(String args[]) {   //main class declared as public and returning nothing 
		
		try{						//Try block to check if code is working/ returning appropriate values
			
			System.out.println("Please enter your Age below: ");  //taking Age input from user
			Scanner IntAge = new Scanner(System.in);     //Scanner object IntAGe to take the integer value from user
			int Age = IntAge.nextInt();   //declared int type variable
			
			if(Age<0) {   //checking for the input values if greater than 0 (POSITIVE) or less than 0(NEGATIVE)
				throw new NegativeAgeException();    //Throwing user defined exception as value is not positive
			}
			else {
				System.out.println("Your Age is: "+Age);   //if value is greater than 0 then print value is positive 
			}
		}
		
		catch(NegativeAgeException ex){    //catching exception thrown by try block (USer defined exception)
			{
			System.out.println(ex);   //printing the error caught in the catch block if no exception received above
			}
		}
	}
}

class NegativeAgeException extends ArithmeticException{    //created a child class derived from ArithmeticException class of EXception class
	
	public String toString() {   //To return string by creating toString method and overriding existing toString 
		return "You have entered a NEGATIVE number";   //returning the exception
	}
}
