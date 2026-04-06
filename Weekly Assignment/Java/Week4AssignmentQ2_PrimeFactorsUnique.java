package Weekly_Assignment;

public class Week4AssignmentQ2_PrimeFactorsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=60;
		System.out.println("Prime factors: ");
		for(int i=2;i<=n;i++) { //here we take i =2 bcz the output start from 2
			if(i>n/2) {
				break;
			}
			if(n%i==0) {
				boolean isPrime=true; //here we check if i is prime
				for(int j=2;j<=i/2;j++) {
					if(i%j ==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) { //print only prime unique factor
					System.out.print(i+" ");
				}
			}
		}

	}

}
/*
 * Write a Java program to:

Take a number n
Print all its prime factors
Do not print repeated factors (unique only)
Stop (use break) if factor becomes greater than n/2

👉 Example:
Input: n = 60
Output: 2 3 5
 */