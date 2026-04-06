package practice1;
import java.util.*;

public class Program6_VoteUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible for Vote");
		}
		else {
			System.out.println("You can not eligible for 3vote ");
		}
		

	}

}
