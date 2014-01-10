package model;

public class Semester {

	private int semId;
	private String semName;
	public int getSemId() {
		return semId;
	}
	public void setSemId(int semId) {
		this.semId = semId;
	}
	public String getSemName() {
		return semName;
	}
	public void setSemName(String semName) {
		this.semName = semName;
	}
	@Override
	public String toString() {
		return "Semester [semId=" + semId + ", semName=" + semName
				+ ", getSemId()=" + getSemId() + ", getSemName()="
				+ getSemName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

