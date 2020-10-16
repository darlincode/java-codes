package mileage.java;

import java.util.Scanner;

public class CreditLimit {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pls enter your acct num: ");
		int acctNum = input.nextInt();
		
		System.out.print("Pls enter your beginningBal: ");
		int beginingBal = input.nextInt();
		
		System.out.print("Pls enter the totalCreditApplied: ");
		int totalCreditApplied = input.nextInt();
		
		
		System.out.print("Pls enter your creditLimit: ");
		int creditLimit = input.nextInt();
	   
		int totalItemCharged = (int) (0.05 * totalCreditApplied);
		int afterPurchaseBal = beginingBal - (totalCreditApplied + totalItemCharged);
		int newBalance = beginingBal + totalItemCharged - totalCreditApplied;
		
		System.out.printf("TotalCharge:%d%nAvailableBal:%d%nNewBalance:%d",
				totalItemCharged,afterPurchaseBal, newBalance);
		     System.out.println();
		if(newBalance > creditLimit) 
		   System.out.println("Sorry!!  credit limit exceeded");
	else
			System.out.println("Sucessful");
		if(creditLimit>totalCreditApplied);
			System.out.println("CreditLimit has been exceded");
	}

}

