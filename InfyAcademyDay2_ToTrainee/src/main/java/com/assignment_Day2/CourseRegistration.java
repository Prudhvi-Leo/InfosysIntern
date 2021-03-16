package com.infy.assignment_Day2;

public class CourseRegistration {
		private String studentName;
		private int registrationId;
		private float qualifyingMarks;
		private double courseFee;
		private int courseId;
		private boolean hostelRequired;
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getRegistrationId() {
			return registrationId;
		}
		public void setRegistrationId(int registrationId) {
			this.registrationId = registrationId;
		}
		public float getQualifyingMarks() {
			return qualifyingMarks;
		}
		public void setQualifyingMarks(float qualifyingMarks) {
			this.qualifyingMarks = qualifyingMarks;
		}
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public boolean isHostelRequired() {
			return hostelRequired;
		}
		public void setHostelRequired(boolean hostelRequired) {
			this.hostelRequired = hostelRequired;
		}
		public double getCourseFee() {
			return courseFee;
		}
		public boolean validateMarks() {
			if(this.qualifyingMarks>=65&&this.qualifyingMarks<=100)
				return true;
			else 
				return false;
		}
		public boolean validateCourseId() {
			if(this.courseId>=1001&&this.courseId<=1005)
				return true;
			else
				return false;
		}
		public void calculateCourseFee() {
			if(this.courseId==1001) {
				if(this.qualifyingMarks>=65&&this.qualifyingMarks<=69) {
					this.courseFee = (55000-(55000*5)/(double)100);
				}
				else if(this.qualifyingMarks>=70&&this.qualifyingMarks<=84) {
					this.courseFee = (55000-(55000*10)/(double)100);
				}
				else 
					this.courseFee = (55000-(55000*15)/(double)100);
					
			}
			else if(this.courseId==1002) {
				if(this.qualifyingMarks>=65&&this.qualifyingMarks<=69) {
					this.courseFee = (35675-(35675*5)/(double)100);
				}
				else if(this.qualifyingMarks>=70&&this.qualifyingMarks<=84) {
					this.courseFee = (35675-(35675*10)/(double)100);
				}
				else 
					this.courseFee = (35675-(35675*15)/(double)100);
					
			}
			else if(this.courseId==1003) {
				if(this.qualifyingMarks>=65&&this.qualifyingMarks<=69) {
					this.courseFee = (28300-(28300*5)/(double)100);
				}
				else if(this.qualifyingMarks>=70&&this.qualifyingMarks<=84) {
					this.courseFee = (28300-(28300*10)/(double)100);
				}
				else 
					this.courseFee = (28300-(28300*15)/(double)100);
					
			}
			else if(this.courseId==1004) {
				if(this.qualifyingMarks>=65&&this.qualifyingMarks<=69) {
					this.courseFee = (22350-(22350*5)/(double)100);
				}
				else if(this.qualifyingMarks>=70&&this.qualifyingMarks<=84) {
					this.courseFee = (22350-(22350*10)/(double)100);
				}
				else 
					this.courseFee = (22350-(22350*15)/(double)100);
					
			}
			else {
				if(this.qualifyingMarks>=65&&this.qualifyingMarks<=69) {
					this.courseFee = (115000-(115000*5)/(double)100);
				}
				else if(this.qualifyingMarks>=70&&this.qualifyingMarks<=84) {
					this.courseFee = (115000-(115000*10)/(double)100);
				}
				else 
					this.courseFee = (115000-(115000*15)/(double)100);
					
			}
		}
		
}
