package org.imarticusFsd.assignment01;

public class Occurences {
	public static void main(String[] args) {
		String str = "Never forget what you are, for surely the world will not. Make it your strength. Then it can never be your weakness. Armour yourself in it and it will never be used to hurt you.";
		str = str.toLowerCase();
		String arr[] = str.split("[,. ]");
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'e') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
