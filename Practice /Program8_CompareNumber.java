package practice1;
import java.util.*;
public class Program8_CompareNumber {
//show a=b then a equal to b,a<b =a lesser than b,a>b =a is greater than b
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Value of a: ");
		int a=sc.nextInt();
		System.out.print("Enter the Value of b: ");
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("a is equal with b");
		}
		else {
			if(a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("a is lesser than b");
			}
		}
	}
}
