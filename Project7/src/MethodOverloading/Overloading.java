package MethodOverloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overloading {
	int sum(int num1, int num2) {
		return num1+num2;
	}
}

class MethodCall{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two integers: ");
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		Overloading ol = new Overloading();
		System.out.println("Result is : " + ol.sum(x, y));
	}
}


