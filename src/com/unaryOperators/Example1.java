package com.unaryOperators;

public class Example1 {

	public static void main(String[] args)
	{

		/**
		 * Unary Operators(++, --)
		 * 
		 * a++ => a = a+1
		 * ++a => a = a+1
		 * 
		 * a-- => a = a-1
		 * --a => a = a-1 
		 * 
		 */

		int a = 30, b = 40, c = 10, d = 60;

		int result1 = a++;//post increment
		int result2 = ++b;//pre increment


		int result11 = c--;//post decrement
		int result12 = --d;//pre decrement
		
		int result10 = a++;
		
		System.out.println(result1);		
		
		System.out.println(result10);
		
		System.out.println(result12);
		
		System.out.println(result11);
		
		System.out.println(result2);




	}

}
