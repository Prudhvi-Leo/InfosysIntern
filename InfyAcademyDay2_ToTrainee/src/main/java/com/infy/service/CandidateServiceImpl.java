package com.infy.service;

import com.infy.dao.CandidateDAO;
import com.infy.dao.CandidateDAOImpl;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;
import com.infy.validator.Validator;

public class CandidateServiceImpl implements CandidateService{
	
	private CandidateDAO candidateDAO;
	// can have status as 'P' only if all 3 marks are 50 and above
	@Override
	public String addCandidate(Candidate candidate) {
		
		candidateDAO = new CandidateDAOImpl();
	Character tempResult = 'P';
		Validator valid = new Validator();
		String val = valid.validate(candidate);
				if(val!=null)
					return val;
		if (candidate.getMark1() < 50 || candidate.getMark2() < 50 || candidate.getMark3() < 50) {
			tempResult = 'F';
		}
		if (!candidate.getResult().equals(tempResult)) {
			return ("Result should be 'F' (Fail) if student scores less than 50 in any one subject");
		}
		
		return candidateDAO.addCandidate(candidate);
	
	
	}

	// calculating grade for candidate based on his marks and result
	@Override
	public String calculateGrade(CandidateReport candidateReportTO) 
		{
		String grade = null;
		if (candidateReportTO.getResult() == 'F') {
			grade = "NA";
		} else {
			float average = (candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3())
					/ 3f;
			if(average >= 85.0)
				grade= "A";
			else if(average >= 75.0 && average < 85.0)
				grade= "B";
			else
				grade="C";
		}
		return grade;
		}

	// populating map<CandidateId, Grade> by calling
	// calculateGrade(candidateReportTO) and returning the same.
	@Override
	public String[] getGradesForAllCandidates() {
		candidateDAO = new CandidateDAOImpl();
		CandidateReport[] allCandidates = candidateDAO.getAllCandidates();
		String[] finalArray = new String[allCandidates.length];
		int index = 0;
		for (CandidateReport report : allCandidates) {
			finalArray[index] = report.getCandidateId()+":"+this.calculateGrade(report);
			index++;
		}
		
		return finalArray;
	}
}
