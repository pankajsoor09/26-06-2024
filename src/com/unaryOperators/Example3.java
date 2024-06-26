package com.unaryOperators;

public class Example3 {

	public static void main(String[] args)
	{

		
		int a = 35, b = 20, c = 30, d = 10;

		int result10 = a++ + --d - --a + d-- - --b + ++a - --b;
					// 35 + 9 - 35 + 9 - 19 + 36 - 18 = 17
		
		System.out.println(result10);

	}

}
