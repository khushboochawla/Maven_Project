package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.daniel.model.Roles;

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

	public List getHighestMarksForSubject(int subjectId) {
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

			ResultSet rs = statement.executeQuery("select * from subject where semesterId="+semesterId+" and courseId=1"+courseId);

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

	public List<Course> getCourseList() {

		//select * from course;
		
		return null;
	}

	public List getStudentList() {
		//select * from student
		return null;
	}

	public List<Semester> getSemesterList() {
		//select * from semester;
		return null;
	}

	public List getPiechartOutputs() {

		return null;
	}

}
