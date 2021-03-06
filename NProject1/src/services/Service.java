package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.*;

/**
 * @author Tushar Choudhary
 * 
 *         This class is used to interact with db to fetch and return the
 *         results
 */

public class Service {
	private Connection connection;
	DbUtil DbUtil;

	public Service() {

		connection = DbUtil.getConnection();
	}
	public Map<String,Double> getHighestMarksForSubject(int subjectId) {
		Map<String,Double> map=new HashMap<String,Double>();
		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement
					.executeQuery("select student.studentName,score.marks from student natural join score AND marks in( SELECT MAX(marks) from score where subjectId="+subjectId) ;
			
			while (rs.next()) {
				map.put(rs.getString("student.studentName"),rs.getDouble("score.marks"));
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return map;
			}
		

	public List<Subject> getSubjectList(int semesterId, int courseId) {	
		List<Subject> subjects = new ArrayList<Subject>();
		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from subject where semesterId = 1 and courseId = 1");
			
			while (rs.next()) {
				Subject subject = new Subject();
				subject.setSubjectId(rs.getInt("subjectId"));
				subject.setSubjectName(rs.getString("subjectName"));
				subjects.add(subject);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return subjects;

	}

	public List<Course> getCourseList() {	//tested output-tushar

		List<Course> courses = new ArrayList<Course>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from course");
			while (rs.next()) {
				Course out = new Course();
				out.setCourseId((rs.getInt("courseId")));
				out.setCourseName((rs.getString("courseName")));
				
				courses.add(out);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return courses;
		//select * from course;
		
		
	}

	public List<Student> getStudentList() {	//tested output-tushar

		List<Student> students = new ArrayList<Student>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from student");
			while (rs.next()) {
				Student out = new Student();
				out.setStudentId((rs.getInt("studentId")));
				out.setCourseId((rs.getInt("courseId")));
				out.setSemesterId((rs.getInt("semesterId")));
				out.setStudentName((rs.getString("studentName")));
				
				students.add(out);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students;
	}

	public List<Semester> getSemesterList() {	//tested output-tushar

		List<Semester> sems = new ArrayList<Semester>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from semester");
			while (rs.next()) {
				Semester out = new Semester();
				out.setSemesterId((rs.getInt("semesterId")));
				out.setSemesterName((rs.getString("semesterName")));
				
				sems.add(out);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sems;
	}

	public List<Subject> getSubjectList() {	
		List<Subject> subjects = new ArrayList<Subject>();
		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from subject");
			
			while (rs.next()) {
				Subject subject = new Subject();
				subject.setSubjectId(rs.getInt("subjectId"));
				subject.setSubjectName(rs.getString("subjectName"));
				subjects.add(subject);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return subjects;

	}
	
	public int addStudent(Student student){   //  need a addStudent function in service that will insert the student in the db and return me the id.
		
		
		return 0;
		
	}
	
	public void addScore(Score score){  // need a addScore function in service that will insert the score in the db for a particular subject and for a particular student.
		
	}


	public List<Score> getPiechartOutputs(String subjectId) {
		List<Score> subjectMarks = new ArrayList<Score>();
		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement
					.executeQuery("select sc.marks, sc.studentId from score sc join student st on sc.studentId=st.studentId where sc.subjectId="
							+ subjectId);
			while (rs.next()) {
				Score scores=new Score();
				scores.setMarks(rs.getInt("sc.marks"));
				scores.setStudentId(rs.getInt("sc.studentId"));
				scores.setSubjectId(rs.getInt("sc.subjectId"));

				subjectMarks.add(scores);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return subjectMarks;

	}

}
