package java_Assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum=0;
		int temp = n;
		while(n>0) {
			int l=n%10;
			sum+=l*l*l;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else {System.out.println("Not a Armstrong number");}
	}

}
