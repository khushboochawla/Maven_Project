package model;

public class Student {

	private int studentId;
	private String studentname;
	private int courseId;
	private int semId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname="
				+ studentname + ", courseId=" + courseId + ", semId=" + semId
				+ "]";
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getSemId() {
		return semId;
	}

	public void setSemId(int semId) {
		this.semId = semId;
	}

}
