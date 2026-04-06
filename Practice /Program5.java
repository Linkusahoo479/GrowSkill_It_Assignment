package practice1;
import java.util.*;

public class Program5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int a= sc.nextInt();
	System.out.print("Enter the second number: ");
	int b=sc.nextInt();
	//float b=sc.nextFloat();
	int sum=a+b;
	
	System.out.println("Sum of these number is: " + a+"+" + b+ "="+ sum);
}
}