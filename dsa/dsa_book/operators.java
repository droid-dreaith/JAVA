package dsa_book;

import java.awt.Point; // a point represents the location (x , y)

public class operators {
	
	private static int[] a;

	public static void main(String[] args) {
		
		//two ways of declaring local variables
		
		int angela; 
		
		int andrea = 23;
		
		Point p1 = new Point (3,4);
		
		//literal is any constant value that can be used in asssigment or other expression
		
		/*LITERALS:
		 * null   -----only object literal
		 * 
		 * boolean
		 * 
		 * integer
		 * 
		 * floating point
		 * 
		 * character
		 *
		 * 
		 */
		System.out.println(p1);
		
		//OPERATORS
		
		//ASSIGNMENT OPERATOR
		
		int ass1 = 9;
		
		int i = 8;
		int j = i++;
		int k = ++i;
		int m = i--;
		int n = 9 + i++;
		
		System.out.println("\n" + i + "\n");
		System.out.println( j + "\n" );
		System.out.println(k + "\n");
		System.out.println( m + "\n");
		System.out.println( n+ "\n");
		System.out.println( k + m + "\n");
		System.out.println(i + j + "\n");
		System.out.println( m + n + "\n" );
		System.out.println(i + j  + k + m + n);
		
		
		//OPERATOR PRECEDENCE
		
		/*Operator Precedence 

				1 
				postfix ops prefix ops cast 
				exp ++ exp −− ++exp −−exp +exp −exp ∼exp !exp (type) exp 
				2 
				mult./div. 
				* / % 
				46
				3 
				add./subt. 
				+ − 
				4 
				shift 
				<< >> >>> 
				5 
				comparison 
				< <= > >= instanceof 
				6 
				equality 
				== != 
				7 
				bitwise-and 
				& 
				8 
				bitwise-xor 
				^ 
				9 
				bitwise-or 
				| 
				10 
				and 
				&& 
				47
				 11 
				or 
				12 
				conditional 
				boolean_expression? value_if_true: 
				value_if_false 
				13 
				assignment 
				= += −= *= /= %= >>= <<= >>>=&= ^= | = 
						 * 
						 */
						
		
		//OPERATIONAL; ASSIGNMENT OPERATORS
		
		//ex :   variable op = expression
		// op is any BINARY OPERATOR that is euqivalent to -------- variable = variable op expression
		

		a[5] = 10;
		
		System.out.println(a);		
		
		
	
		
		
		   
	}
}