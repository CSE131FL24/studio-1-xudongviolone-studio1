package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("what's name #1");
		String name1 = in.nextLine();
		System.out.print("what's name #2");
		String name2 = in.nextLine();
		System.out.print("what's name #3");
		String name3 = in.nextLine();
		System.out.print("what's name #4");
		String name4 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.print("Hello " + name1 + ", " + name2 + ", "  + name3 + ", and " + name4 + ". How are you?");

	}
}
