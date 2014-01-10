package model;

public class Score {

	private int scoreId;
	private int subId;
	private String rollNumber;
	private double marks;
	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", subId=" + subId
				+ ", rollNumber=" + rollNumber + ", marks=" + marks
				+ ", getScoreId()=" + getScoreId() + ", getSubId()="
				+ getSubId() + ", getRollNumber()=" + getRollNumber()
				+ ", getMarks()=" + getMarks() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getScoreId() {
		return scoreId;
	}
	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
