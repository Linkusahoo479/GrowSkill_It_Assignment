package Weekly_Assignment;
import java.util.*;

public class Week3AssignmentQ2_AsciiExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char inputChar=sc.next().charAt(0);
		int asciiValue=(int) inputChar; //ascii value = char to int conversion
		System.out.println("ASCII value: "+ asciiValue); 
		int newAsciiValue =asciiValue +5;
		System.out.println("New ASCII value: "+ newAsciiValue);
		char newChar =(char) newAsciiValue;
		System.out.println("New Character: "+ newChar);

		
		
	}

}


    
   
