package com.unaryOperators;

public class Example4 {

	public static void main(String[] args)
	{

		
		int a = 15, b = 30, c = 20, d = 11;

		int result10 = b++ + --a - --c + a-- - --d + ++c - --a - d--;
							
		System.out.println(result10);//27

	}

}

