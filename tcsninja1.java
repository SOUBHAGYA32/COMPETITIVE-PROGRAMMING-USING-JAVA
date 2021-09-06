/*One programming language has the following keywords that cannot be used as identifiers:

break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not

Test cases
Case 1
Input – defer
Expected Output – defer is a keyword
Case 2
Input – While
Expected Output – while is not a keyword */

import java.util.*;
public class tcsninja1 {
	public static void main(String[] args) {
		String str[]= {"break", "case", "continue", "default", "defer", "else","for", "func", "goto","if", "map", "range", "return", "struct", "type", "var"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String input=sc.next();
		int count =0;

		for (int i=0;i<str.length;i++) {
			if(str[i].equals(input))
			{
				count = 1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(input+" is a Keyword.");
		}
		else{
			System.out.println(input+" is not a Keyword.");
		}


	}
}