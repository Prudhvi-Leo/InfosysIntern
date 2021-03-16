package com.infy.assignment_Day_2_6;

public abstract class RRTechnicalCertification implements Certification {
	private String studentName;
	private String courseName;
	private int registrationId;
	private int admissionTestMarks;
	public static int counter;
	
	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		super();
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
	}
	abstract void generateRegistrationId();
	public abstract double calculateFee();
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}

	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}
		


}

class RegularCourseCertification extends RRTechnicalCertification {
	public static int oddId = 1001;
	private int courseDuration;

	RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration = courseDuration;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public void generateRegistrationId() {
		super.setRegistrationId(oddId);
		oddId = oddId + 2;
	}
	
	 public double calculateFee() {
		 double val = Certification.REGULAR_COURSE * this.getCourseDuration();
		  if(getAdmissionTestMarks()>=90&&getAdmissionTestMarks()<=100) {
					
								return val - (val*10/100);
	}
else if(getAdmissionTestMarks()>=75&&getAdmissionTestMarks()<=89) {
			
				return val - (val*5/100);
	}
	else {
	
			return val;
	
		} 

	  }
	 
}

class CrashCourseCertification extends RRTechnicalCertification {
	public static int evenId = 1002;

	CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);

	}

	public void generateRegistrationId() {
		super.setRegistrationId(evenId);
		evenId = evenId + 2;
	}
	
	  public double calculateFee() {
		  if(getAdmissionTestMarks()>=90&&getAdmissionTestMarks()<=100) {

					double fee =  (Certification.CRASH_COURSE_FEE - (Certification.CRASH_COURSE_FEE*10/100));
					return fee + fee*12.36/100;
	
	}
else if(getAdmissionTestMarks()>=75&&getAdmissionTestMarks()<=89) {
			
					double fee =  (Certification.CRASH_COURSE_FEE - (Certification.CRASH_COURSE_FEE*5/100));
					return fee + fee*12.36/100;
				
	}
	else {
	
				double fee =  Certification.CRASH_COURSE_FEE;
				return fee + fee*12.36/100;

		} 
	}
	 
}