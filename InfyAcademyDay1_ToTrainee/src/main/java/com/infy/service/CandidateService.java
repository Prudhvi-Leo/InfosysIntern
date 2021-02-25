package com.infy.service;

import com.infy.model.Candidate;
import com.infy.model.CandidateReport;
import com.infy.dao.*;
public class CandidateService {
			
	// can have status as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) {
if((candidate.getMark1() <50||candidate.getMark2()<50||
		candidate.getMark3()<50)&&(candidate.getResult() == 'P')) {
		return "INSERT_FAILURE";
	}
else {
	CandidateDAO d = new CandidateDAO();
	 return d.addCandidate(candidate);
	
	
}
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		double Average = ( candidateReportTO.getMark1()+candidateReportTO.getMark2()+ candidateReportTO.getMark3())/(double)3;
		if(candidateReportTO.getResult()=='F')
			return "NA";
		else if(Average>= 85)
			return "A";
			else if(Average <85 && Average >=75)
				return "B";
			else
				return "C";
	
	}

	// populating map<CandidateId, Grade> by calling
	// calculateGrade(candidateReportTO) and returning the same.
	public String[] getGradesForAllCandidates() {
		CandidateDAO d = new CandidateDAO();
				CandidateReport[] ar =  d.getAllCandidates();
			String[] candidate = new String[ar.length];	
			int i=0;
		for(CandidateReport obj:ar) {
					candidate[i] = calculateGrade(obj);
					i++;
		}
		return candidate;
	}
}
