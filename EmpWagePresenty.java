package com.bridglabz.employewage;

public class EmpWagePresenty {

	public static void main(String[] args) {
		
		int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 2;
		switch (presentAbsent) {
		case 1:
			 System.out.print("Emplyee is Present");
			 break;
		case 2:
			 System.out.print("Emplyee is Absent");
		}
	}

}
