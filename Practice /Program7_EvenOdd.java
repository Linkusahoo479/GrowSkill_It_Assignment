package practice1;
import java.util.*;

public class Program7_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
				int num =sc.nextInt();
				if(num%2==0) {
					System.out.println("The number is Even");
				}
				else {
					System.out.println("The number is Odd");
				}
	}

}
