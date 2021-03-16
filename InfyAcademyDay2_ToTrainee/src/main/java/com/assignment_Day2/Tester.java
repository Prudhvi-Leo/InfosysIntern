package com.infy.assignment_Day2;

public class Tester {
	public static boolean validateMarks;
	public static boolean validateCourseId;
	public static void setDetails(String Name,int RegistrationId,float QualifyingMarks,int courseId,boolean hostelRequired) {
		CourseRegistration courseregister = new CourseRegistration();
		courseregister.setStudentName(Name);
		courseregister.setRegistrationId(RegistrationId);
		courseregister.setQualifyingMarks(QualifyingMarks);
		courseregister.setCourseId(courseId);
		courseregister.setHostelRequired(hostelRequired);
		validateMarks = courseregister.validateMarks();
		validateCourseId = courseregister.validateCourseId();
		display(validateMarks,validateCourseId,courseregister);
	}
	public static void display(boolean a,boolean b,CourseRegistration register) {
		if(a==false&&b==false) {
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
			System.out.println("Invalid Course Id. Please try again!!");
		}
		else if(a==false)
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
		else if(b==false)
			System.out.println("Invalid Course Id. Please try again!!");
		else {
			System.out.println("***************Course Allocation Details***************");
			System.out.println("\tStudent Name                    :"+register.getStudentName());
			System.out.println("\tCourse Id                       :"+register.getCourseId());
			System.out.println("\tQualifying Exam Marks           :"+register.getQualifyingMarks());
			System.out.println("\tStudent's Registration Id       :"+register.getRegistrationId());
			register.calculateCourseFee();
			System.out.println("\tTotal course fee                :"+register.getCourseFee());
			if(register.isHostelRequired()==true)
			System.out.println("\tHostel Required                 :Yes");
			else
				System.out.println("\tHostel Required                 :No");
		}
		System.out.println();
		System.out.println();
			
	}
	public static void main(String[] args) {
			setDetails("Peter",5001,58,1005,true);		
			setDetails("Peter",5001,68,1006,true);
			setDetails("Peter",5001,78,1005,false);
	}

}
