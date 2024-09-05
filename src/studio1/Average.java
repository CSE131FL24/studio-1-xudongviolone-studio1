package studio1;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("give me the first of two integers please");
		int int1 = in.nextInt();
		
		System.out.println("give me the second of two integers please");
		int int2 = in.nextInt();
		
		double avg_val = (int1+int2)/2;
		
		System.out.print(avg_val);
		
	}

}
