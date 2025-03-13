package Mid_DataStructureActs;

public class sequaentialFibonacci {

	public static void main(String[] args) {
		
		int n=13;  //number ng terms sa fibonacci equence
		System.out.println("Fibonacci series of " + n + " terms are: ");
		
		//start muna sa first 2 fibonacci numbers
		int f1=0, f2 = 1;
		System.out.print(f1 + ", " + f2); //dito ipiprint yung first 2 numbers
		
		int currentTerm = 3;
		//start generating sequence with long chain of method calls
		step1(f1,f2,currentTerm,n);
	}
	public static void step1(int f1,int f2,int currentTerm,int totalTerms) {
		
		if (currentTerm > totalTerms) return;
		int sum= f1+ f2;
		System.out.print(", " + sum);
		step2(f2, sum,currentTerm + 1, totalTerms);
	}
	
	public static void step2(int f1,int f2,int currentTerm,int totalTerms) {
		
		if(currentTerm > totalTerms) return;
		int sum = f1 + f2;
		System.out.print(", "+ sum);
		step3(f2,sum,currentTerm + 1,totalTerms);
	}
	
	public static void step3(int f1,int f2,int currentTerm,int totalTerms) {
		
		if(currentTerm > totalTerms) return;
		int sum = f1 + f2;
		System.out.print(", "+ sum);
		step4(f2, sum, currentTerm + 1,totalTerms);
	}
	
	public static void step4(int f1,int f2,int currentTerm,int totalTerms) {
		
		if(currentTerm > totalTerms) return;
		int sum = f1 + f2;
		System.out.print(", "+ sum);
		step5(f2, sum, currentTerm + 1,totalTerms);
	}
public static void step5(int f1,int f2,int currentTerm,int totalTerms) {
		
		if(currentTerm > totalTerms) return;
		int sum = f1 + f2;
		System.out.print(", "+ sum);
		step6(f2, sum, currentTerm + 1,totalTerms);
	}
public static void step6(int f1,int f2,int currentTerm,int totalTerms) {
	
	if(currentTerm > totalTerms) return;
	int sum = f1 + f2;
	System.out.print(", "+ sum);
	step7(f2, sum, currentTerm + 1,totalTerms);
}
public static void step7(int f1,int f2,int currentTerm,int totalTerms) {
	
	if(currentTerm > totalTerms) return;
	int sum = f1 + f2;
	System.out.print(", "+sum);
	
}
	}


