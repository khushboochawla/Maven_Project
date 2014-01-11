package model;

public class Score {

	private int scoreId;
	private int subjectId;
	private int studentId;
	private double marks;
	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", subId=" + subjectId
				+ ", studentId=" + studentId + ", marks=" + marks
				+ ", getScoreId()=" + getScoreId() + ", getSubId()="
				+ getSubjectId() + ", getStudentId()=" + getStudentId()
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
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubId(int subId) {
		this.subjectId = subId;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
