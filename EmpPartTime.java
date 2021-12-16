package com.bridglabz.employewage;

public class EmpPartTime {

	public static void main(String[] args) {
		int dailyWage=0;
		int empWagePerHour=20;
		int workingPerHour=8;
		int partTimeHour=4;
		int dayinMonth=20;
		int totalWage=0;
		
		for(int i=0;i<=dayinMonth;i++) {
		int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 3+1;
		switch (presentAbsent) {
		case 1:
			 System.out.print("Emplyee is Present");
			 dailyWage=workingPerHour*empWagePerHour;
			 
			 break;
		case 2:
			 System.out.print("Employee is Present Part Time");
			 dailyWage=partTimeHour*empWagePerHour;
			 
			 break; 
		case 3:
			 System.out.print("Employee is Absent");
			 break;
		}
		 System.out.println(" Employee Daily Wage is "+dailyWage);
		  totalWage=totalWage+dailyWage;
	}
		 System.out.println(" Employee Monthly Wage is "+totalWage);
	}
        
}


