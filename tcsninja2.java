/*
Program to check if a year is Leap Year or not 💖
*/

import java.util.*;
public class tcsninja2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year = sc.nextInt();
		boolean isLeap = false;
		if(year%4 == 0) //If the year is divided by 4
		{
			if(year%100==0) //If the year is a Century
			{
				if(year%400==0) //If the year is divided by 400 the it is a leap year
				{
					isLeap=true;
				}
				else {
					isLeap=false;
				}

			}
			else{

				isLeap=true; // if the year is not century
			}
		}
		else {
			isLeap=false;
		}
		if(isLeap==true)
		{
			System.out.println(year+" is a Leap year.");
		}
		else {
			System.out.println(year+" is not a Leap Year.");
		}
	}
}