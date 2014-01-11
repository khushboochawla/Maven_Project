package services;

import java.sql.Connection;
import java.util.List;

import model.Course;
import model.Semester;
import model.Subject;

/**
 * @author Tushar Choudhary
 *
 * This class is used to interact with db to fetch and return the results
 */

public class Service {
	private Connection connection;
	DbUtil DbUtil;

	public Service() {

		connection = DbUtil.getConnection();
	}

	public Object getHighestMarksForSubject() {

		return null;

	}

	public List<Subject> getSubjectList() {

		return null;
	}

	public List<Course> getCourseList() {

		return null;
	}

	public List getStudentList() {

		return null;
	}
	public List<Semester> getSemesterList(){
		return null;
	}

	public List getPiechartOutputs() {

		return null;
	}

}
