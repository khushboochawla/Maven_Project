package model;

public class Semester {

	private int semesterId;
	private String semesterName;

	public int getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	@Override
	public String toString() {
		return "Semester [semesterId=" + semesterId + ", semesterName="
				+ semesterName + "]";
	}

	
	

}
