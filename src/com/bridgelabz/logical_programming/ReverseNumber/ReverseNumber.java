package com.bridgelabz.logical_programming.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	   {
	      int num=0;
	      int reversenum =0;
	      System.out.println("Enter your number: ");
	      Scanner in = new Scanner(System.in);
	        num = in.nextInt();
	       while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of number is: "+reversenum);
	   }
	}
