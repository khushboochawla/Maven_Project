package services;

import java.awt.List;
import java.sql.Connection;

/**
 * @author Tushar Choudhary
 *
 * This class is used to interact with db to fetch and return the results
 */

public class Service {
	private Connection connection;
	util.DbUtil DbUtil;

	public Service() {

		connection = DbUtil.getConnection();
	}

	public Object getHighestMarksForSubject() {

		return null;

	}

	public List getSubjectList() {

		return null;
	}

	public List getCourseList() {

		return null;
	}

	public List getStudentList() {

		return null;
	}

	public List getPiechartOutputs() {

		return null;
	}

}
