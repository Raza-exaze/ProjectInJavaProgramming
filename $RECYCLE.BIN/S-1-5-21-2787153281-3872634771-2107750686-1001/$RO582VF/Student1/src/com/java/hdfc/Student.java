package com.java.hdfc;

public class Student 
{
	private int insuranceId;
	private String candidateName;
	
	public Student()
	{
	}

	public Student(int insuranceId, String candidateName) {
		this.insuranceId = insuranceId;
		this.candidateName = candidateName;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "Student [insuranceId=" + insuranceId + ", candidateName=" + candidateName + "]";
	}
	
	
	
	

}
