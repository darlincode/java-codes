package mileage.java;

import java.util.Scanner;


public class Mileage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totaltrip=0,totalfuel=0;
        int in=0;
        int trip=-1,fuel=-1;
        System.out.println(" fuel used");
        while(trip!=0 && fuel!=0){
            System.out.println("trip gone");
            trip=sc.nextInt();
            System.out.println("total trip gone");
            fuel=sc.nextInt();
            if(fuel>0 && trip>0){
                
            System.out.println("Average of this Trip is = "+ ("total fuel used"));
            totalfuel+=fuel;
            totaltrip+=trip;
            in++;
            }
        }
        
        
        System.out.println("Average Till Now = "+(totaltrip/totalfuel)+" miles+gallon");
        
        
        System.out.println("All averaged Average Till Now = "+((totaltrip/in)/(totalfuel/in))+" miles+gallon");
        
    }
    
}



