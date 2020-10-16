package mileage.java;

import java.util.Scanner;


public class gasmileage {

	public static void main(String[] args) {

		
	int trip =0;
	int miles;
	int gallons;
	double miles_per_gallons;
	double total_miles =0;
	int total_gallons =0;
	double total_miles_per_gallons = 0;
	
	 if("print_total_miles" != null);
	
	
	Scanner input =new Scanner(System.in);
	
System.out.println("enter_miles_driven_or -1");
	
		miles = input.nextInt();

while(miles != -1){
	System.out.println("enter gallons used");
	gallons = input.nextInt();
	
	miles_per_gallons = (miles/gallons);
	
	total_miles = (total_miles + miles);
	total_gallons = (total_gallons + gallons);
	total_miles_per_gallons = (total_miles/total_gallons);
	
	System.out.println("enter_miles_driven_or -1");
	miles = input.nextInt();
	}
		
System.out.print(total_miles_per_gallons);		
		
		
		
		

	}

}
