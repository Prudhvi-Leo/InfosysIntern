package com.student.service;
import java.util.Arrays;
import java.util.List;
import com.desktop.allocation.service.DesktopAllocator;
import com.infy.timeallocation.service.TimeAllocator;
public class Student {
	private String name;
	private int rollNumber;
	private String desktopNumber;
	private String examSlot;
//	public Student(String string, int i) {
//		// TODO Auto-generated constructor stub
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDesktopNumber() {
		return desktopNumber;
	}
	public void setDesktopNumber(String desktopNumber) {
		this.desktopNumber = desktopNumber;
	}
	public String getExamSlot() {
		return examSlot;
	}
	public void setExamSlot(String examSlot) {
		this.examSlot = examSlot;
	}
	static void display(List<Student> s) {
		System.out.println("Exam Slot Details :-");
		for(Student student : s) {
			System.out.println("____________________");
			System.out.println("Student Details");
			System.out.println("Name :-"+ student.getName());
			System.out.println("Roll Number :-"+student.getRollNumber());
			DesktopAllocator allocate = new DesktopAllocator();
			student.setDesktopNumber(allocate.allocateDesktopNumber(student.getRollNumber()));
			System.out.println("Desktop Number :-"+student.getDesktopNumber());
			TimeAllocator time = new TimeAllocator();
			student.setExamSlot(time.allocateTimeSlot(student.getDesktopNumber()));
			System.out.println("Exam SlotAfternoon "+student.getExamSlot());
			System.out.println("____________________");
		}
		
	}
		public static void main(String args[]) {
			Student s1 = new Student();
			s1.setName("Mathew");
			s1.setRollNumber(15);
			Student s2 = new Student();
			s2.setName("Thomas");
			s2.setRollNumber(42);
			Student s3 = new Student();
			s3.setName("Sherry");
			s3.setRollNumber(20);
			Student s4 = new Student();
			s4.setName("Garry");
			s4.setRollNumber(47);
			Student s5 = new Student();
			s5.setName("Shelton");
			s5.setRollNumber(16);
			List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
				display(list);
		} 
}
