package printPowerBill;

import java.util.Scanner;

public class CalculateBill {
	final int UPTO100=100;
	final int UPTO500=500;
	
	public static float bill;
	private static Scanner s;
	public static void main(String args[]) {
		System.out.println("Enter The Number Of Units Used:");
		s = new Scanner(System.in);
		int units = s.nextInt();
		if (units<=100) {
			bill=(float) (units*2.50);
			
			}
		if(units>100 && units<=500) {
			bill=(float) (100*2.50);
			bill=(float) ((units-100)*3.0)+bill;
		}
		if(units>500) {
			bill=(float) (100*2.5);
			bill=(float) (400*3.0)+bill;
			bill=(float)((units-500)*4.50)+bill;
			
		}

		System.out.println("Bill is:"+ bill);
		
		
	}

}
