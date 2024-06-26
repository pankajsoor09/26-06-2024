package com.unaryOperators;

public class Example2 {

	public static void main(String[] args)
	{

		
		int a = 30, b = 40, c = 10, d = 60;

		int result10 = a++ + --d - --a + d-- - --b + ++a - --b;
					//30 + 59 - 30 + 59 - 39 + 31 - 38 = 72 
		
		System.out.println(result10);

	}

}
