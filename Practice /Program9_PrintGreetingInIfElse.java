package practice1;
import java.util.*;
public class Program9_PrintGreetingInIfElse {
	//prees 1 for Hello ,press 2 for Namaste,press 3 for Benjour

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Button:-  ");
		int button = sc.nextInt();
		if(button==1) {
			System.out.println("Hello");
		}
			else if(button==2) {
				System.out.println("Namaste");
			}
			else if(button == 3) {
				System.out.println("Benjour");
				
			}
			else {
				System.out.println("Invalid key");
			}
	}

}
