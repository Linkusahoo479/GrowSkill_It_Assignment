package Weekly_Assignment;

public class Week4AssignmentQ3_DigitTransformer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 57243;
		int result=0;
		int place =1;
		int position=1;
		
		while(n>0) {
			int digit=n%10;
			int newDigit;
			if(position%2!=0) {
				if(digit<=4) {
					newDigit =digit*2;
				}
				else {
					newDigit=digit;
			}
	}
			else {
				newDigit=1;
			}
			result =result +(newDigit *place);
			place *=10;
			position++;
			n=n/10;
}
		System.out.println("Result is : "+result);
	}
}
/*

✅ Q3. Digit Transformation Logic (Advanced)

Write a Java program to:

Take a number n
Traverse digits from right to left
Apply the following rules:
If digit is at odd position AND digit ≤ 4 → multiply by 2
If digit is at even position → replace with 1
Else (odd position and digit > 4) → keep as it is
Form a new number from the result

👉 Example:
Input: n = 57243

Step-by-step:

3 (position 1, odd ≤ 4) → 6
4 (position 2, even) → 1
2 (position 3, odd ≤ 4) → 4
7 (position 4, even) → 1
5 (position 5, odd > 4) → 5

Output: 51416           
 */