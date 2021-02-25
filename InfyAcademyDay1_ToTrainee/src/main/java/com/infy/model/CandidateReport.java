package com.infy.model;

public class CandidateReport {
	private int candidateId;
	private String candidateName;
	private int mark1;
	private int mark2;
	private int mark3;
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	private char result;
	private String grade;
	public CandidateReport(int candidateId,String candidateName,int mark1,int mark2,int mark3, char result, String grade) {
		this.setCandidateId(candidateId);
		this.setCandidateName(candidateName);
		this.setGrade(grade);
		this.setMark1(mark1);
		this.setMark2(mark2);
		this.setMark3(mark3);
		this.setResult(result);
		
	}

	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
