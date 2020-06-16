package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateInput {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int num1, num2, output;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter another number: ");
		num2 = Integer.parseInt(br.readLine());
		
		output = num1 + num2;
		System.out.println("Result is : "+output);
	}
}
