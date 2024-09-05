package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("give me a year please");
		int year = in.nextInt();
		
		int div_4 = year % 4;
		int div_400 = year % 400;
		int div_100 = year % 100;
		
		boolean leaptrue  = div_4 == 0 && div_100 != 0;
		boolean leaptrue2 = div_400 == 0;
		
		boolean fin = leaptrue || leaptrue2;
				
		System.out.println(fin);
		

	}

}
