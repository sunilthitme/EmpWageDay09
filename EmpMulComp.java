package com.bridglabz.employewage;

public class EmpMulComp {

	public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			EmpWage wage=new EmpWage();
			wage.calculate(20,20,100);
			}

		}
	class EmpWage{
		public static void calculate(int wagePerHour,int dayinMonth,int maxWorkingHour) {
			int workingHour=0;
			int totalWorkingHour=0;
			int totalWage=0;
			for(int day=0; day<dayinMonth && totalWorkingHour<maxWorkingHour; day++) {
				int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 3;
				switch(presentAbsent) {
				case 1:
				       workingHour=8;
				       System.out.print("Emplyee is Present Full time	");
			            break;
				case 2:
				        workingHour=4;
				        System.out.print("Emplyee is Present Part time ");
				        break;
				 default:
					     workingHour=0;
					     System.out.print("Emplyee is Absent");
					     break;
			
			}
			totalWorkingHour+=workingHour;
			int dailyWage=workingHour*wagePerHour;
			totalWage+=dailyWage;
			
			System.out.println("\t" +"Day " + day + " wage is ::"  + dailyWage);
			}
				
			System.out.println("Monthly wage is::"+totalWage);
		}
		}


