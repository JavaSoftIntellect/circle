package circle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter 'r' of the circle:");
		int firstInt = reader.nextInt();
		System.out.print("P=");
		System.out.println(firstInt*2*3.14);
		System.out.print("S=");
	    System.out.println(firstInt*firstInt*3.14);

		
	}
}
