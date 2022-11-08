package com.BalanceBracket;

public class Main {

	public static void main(String[] args) {

		CheckBrackets balanceBarcket = new CheckBrackets();
		String bracketExpression = "([[{}]])";

		if (balanceBarcket.checkBalance(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets ");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
