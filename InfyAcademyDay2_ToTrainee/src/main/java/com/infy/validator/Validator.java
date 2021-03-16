package com.infy.validator;

import java.time.LocalDate;

import com.infy.model.Candidate;

public class Validator {
	
	public String validate(Candidate candidate) {	
		if(isValidCandidateName(candidate.getCandidateName())) {
			if(isValidCandidateId(candidate.getCandidateId())) {
				if(isValidDepartment(candidate.getDepartment())) {
					if(isValidExamDate(candidate.getExamDate())) {
						if(isValidResult(candidate.getResult())) {
							if(isValidExamMarks(candidate)) {
								return null;
							}
							else {
								return "INVALID_EXAM_MARKS";
							}
						}
						else {
							return "INVALID_RESULT";
						}
					}
					else {
						return "INVALID_EXAM_DATE";
					}
				}
				else {
					return "INVALID_DEPARTMENT";
					}
			}
			else {
				return "INVALID_CANDIDATE_ID";
			}
		}
		else {
			return "INVALID_CANDIDATE_NAME";
		}
		
	}	

	// The entered candidate name should contain only alphabets. Cannot have
	// special characters and only spaces
	public Boolean isValidCandidateName(String candidateName) {
				String regex = "[A-Za-z]+";
				if(candidateName.matches(regex))
					return true;
				else 
					return false;
	}

	// The entered candidate ID should be of size 5
	public Boolean isValidCandidateId(Integer string) {
			String regex = "\\d{5}";
			String valid = string.toString();
			if(valid.matches(regex))
				return true;
			else
				return false;
	}

	// The entered Department name should be one among the given departments
	// (ECE, CSE, IT, EEE)
	public Boolean isValidDepartment(String department) {
			String regex = "(ECE|CSE|IT|EEE)";
				if(department.matches(regex))
					return true;
				else 
					return false;
	}

	// exam date cannot be today or after todays date
	public Boolean isValidExamDate(LocalDate examDate) {
			LocalDate date = LocalDate.now();
			if(examDate.isBefore(date))
				return true;
			else
				return false;
	}
	
	//Checking if marks are not equal to "0"
	public Boolean isValidExamMarks(Candidate candidateTO) {
		if(candidateTO.getMark1()<0||candidateTO.getMark2()<0||candidateTO.getMark3()<0)
			return false;
		else
			return true;
	}
	
	//Checking if result set is either 'P' or 'F' only
	public Boolean isValidResult(Character result) {
		if(result=='P'||result=='F')
			return true;
			else
				return false;
	}


}
