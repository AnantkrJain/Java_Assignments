package org.imarticusFsd.assignment01;

import java.util.Scanner;

public class Divisibility {
	private static Scanner sc;

	public static void main(String[] args) {

		 sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num = sc.nextInt();
		 
		 for(int i=num; i<=100; i++) {
			if(i%num == 0) {
				System.out.println(i);
			}
		 }
	}
}
