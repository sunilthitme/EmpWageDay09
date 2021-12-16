package com.bridglabz.employewage;

public class EmpDailyWage {

	public static void main(String[] args) {
		int dailyWage=0;
		int empWagePerHour=20;
		int workingPerHour=8;
		int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 2+1;
		switch (presentAbsent) {
		case 1:
			 System.out.print("Emplyee is Present");
			 dailyWage=workingPerHour*empWagePerHour;
			 
			 break;
		case 2:
			 System.out.print("Emplyee is Absent");
		}
		 System.out.print(" Emplyee Daily Wage is "+dailyWage);
	}

}
