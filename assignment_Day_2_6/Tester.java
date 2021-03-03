package com.infy.assignment_Day_2_6;

public class Tester {
	public static void display(Certification ct) {
		RRTechnicalCertification register = (RRTechnicalCertification) ct;
		if(register instanceof RegularCourseCertification) {
		System.out.println("Regular Course Registration Details");
			System.out.println("***************************************");
			System.out.println("Student Name         : "+register.getStudentName());
			System.out.println("Course Name          : "+register.getCourseName());
			RegularCourseCertification duration = (RegularCourseCertification)register;
			System.out.println("Course Duration      : "+duration.getCourseDuration()+" months");
			duration.generateRegistrationId();
			System.out.println("Registration ID      : "+register.getRegistrationId());
			System.out.println("Fees                 : "+register.calculateFee());
		}
		else {
			System.out.println("Crash Course Registration Details");
			System.out.println("***************************************");
			System.out.println("Student Name         : "+register.getStudentName());
			System.out.println("Course Name          : "+register.getCourseName());
			//RegularCourseCertification duration = (RegularCourseCertification)register;
			System.out.println("Course Duration      : 2 month ");
			CrashCourseCertification id = (CrashCourseCertification) register;
			id.generateRegistrationId();
			System.out.println("Registration ID      : "+id.getRegistrationId());
			System.out.println("Fees                 : "+register.calculateFee());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Certification regular = new RegularCourseCertification("Rakesh","J2EE",85,5);
		//regular.courseD
		display(regular);
		
		Certification crashCourse = new CrashCourseCertification("Rohan","Angular",71);
		display(crashCourse);
		
	}

}
