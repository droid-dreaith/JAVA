package Mid_DataStructureActs;
import java.util.Scanner;

public class MachineProblem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		System.out.println("====Choose a number: ====\n");
		System.out.println("[1] Sum of digits" +"\n[2] Reverse the number" 
		+"\n[3] Display all prime numbers from 2 to n" + "\n[4] Palindrome Checking"
		+"\n[5] Odd or even number"+"\n[6] Exit");
		
		
		int choice =sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("Enter a number: ");
			int number =sc.nextInt();
			int sum=0;
			
			while(number > 0) {
				int digit = number % 10;
				sum += digit;
				number /=10; }
			
			System.out.println("Sum of Digits: "+ sum);
			
			break;
			}
		
		case 2 : {
			System.out.println("Enter a number: ");
			int reversed = 0;
			num = sc.nextInt();
			
			while(num != 0) {
				int digit=num%10;
				reversed = reversed * 10 + digit;
				num /= 10;
			}
			System.out.println("Reversed Number: "+reversed);
			
			break;
		}
		case 3: {
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println("Prime numbers from 2 to "+ n + "are: ");
			for(int i=2;i <=n;i++) {
				boolean isPrime = true;
				for (int j=2;j<=Math.sqrt(i);j++) {
					if (i % j==0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i +" ");
				}
			}
			System.out.println();
			break;
		}
		case 4: {
		   System.out.println("Enter a string: ");
		   String str=sc.next();
		   String reverseStr="";
		   int strLength =str.length();
		   
		   for(int i=(strLength-1);i>0;--i) {
			   reverseStr += str.charAt(i);
		   }
		   
		   if (str.equalsIgnoreCase(reverseStr)) {
			   System.out.println(str + "is a Palindrome String ");
		   }else{
			   System.out.println(str + "is not a Palindrome String");
		   }
		   break;
		   }
		case 5: {
			System.out.println("Enter a number: ");
			int number=sc.nextInt();
			if(number%2==0) {
				System.out.println(number + "is even");
			}else {
				System.out.println(number + "is odd");
			}
			break;
		}
		case 6 : {
			System.out.println("Exit");
			break;
		}
		default: {
			System.out.println("Invalid choice");
			break;
		}
	}
		sc.close();
		//sum of DIGIT
		
		//REVRERSE THE NUMBER
		
		//DISPLAY ALL PRIME NUMBERS
		
		//PALINDROME CHECKING
		
		//odd or even numbers
		
		//exit

	}

}
