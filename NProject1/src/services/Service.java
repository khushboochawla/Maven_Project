package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;



import model.Course;
import model.Score;
import model.Semester;
import model.Subject;

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
	public List<Score> getHighestMarksForSubject(int subjectId) {
		List<Score> marks = new ArrayList<Score>();
		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement
					.executeQuery("select sc.marks, sc.studentId from score sc join student st on sc.studentId=st.studentId where sc.subjectId="
							+ subjectId);
			while (rs.next()) {
				Score scores = new Score();
				scores.setMarks(rs.getInt("sc.marks"));
				scores.setStudentId(rs.getInt("sc.studentId"));
				scores.setSubId(rs.getInt("sc.subjectId"));

				marks.add(scores);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return marks;
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

	public List getPiechartOutputs() {

		return null;
	}

}
