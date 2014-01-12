package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Course;
import model.Score;
import model.Semester;
import model.Student;
import model.Subject;
import services.Service;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Service service;
	private static String INSERT = "/student.jsp";
	private static String VIEWPIE = "/selectpie.jsp";

	/**
	 * Default constructor.
	 */
	public Controller() {
		// TODO Auto-generated constructor stub
		super();
		service = new Service();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("add")) {

			List<Course> courses = service.getCourseList();// need a function in
															// service that
															// gives me list of
															// courses
			List<Subject> subjects = service.getSubjectList();// need a function
																// in service
																// that gives me
																// list of
																// subjects
			List<Semester> semesters = service.getSemesterList();// need a
																	// function
																	// in
																	// service
																	// that
																	// gives me
																	// list of
																	// semester
			request.setAttribute("courses", courses);
			request.setAttribute("semesters", semesters);
			request.setAttribute("subjects", subjects);
			forward = INSERT;
		} else if (action.equalsIgnoreCase("viewpie")) {

			List<Course> courses = service.getCourseList();// need a function in
															// service that
															// gives me list of
															// courses
			List<Subject> subjects = service.getSubjectList();// need a function
																// in service
																// that gives me
																// list of
																// subjects
			List<Semester> semesters = service.getSemesterList();// need a
																	// function
																	// in
																	// service
																	// that
																	// gives me
																	// list of
																	// semester
			request.setAttribute("courses", courses);
			request.setAttribute("semesters", semesters);
			request.setAttribute("subjects", subjects);
			forward = VIEWPIE;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Course course= new Course();
		Score score = new Score();
		// Semester semester= new Semester();
		Student student = new Student();
		// Subject subject = new Subject();
		student.setStudentName(request.getParameter("studentname"));
		// course.setCourseName(request.getParameter("courseName"));
		// semester.setSemesterName(request.getParameter("semesterName"));
		// subject.setSubjectName(request.getParameter("subjectName"));
		double marks = Double.parseDouble(request.getParameter("score"));
		score.setMarks(marks);
		// String studentId = request.getParameter("studentid");
		// student.setStudentId(Integer.parseInt(studentId));
		String crse = request.getParameter("courses");
		student.setCourseId(Integer.parseInt(crse));
		String sem = request.getParameter("semesters");
		student.setSemesterId(Integer.parseInt(sem));
		int studentId = service.addStudent(student); // need a addStudent
														// function in service
														// that will insert the
														// student in the db and
														// return me the id.
		String sub = request.getParameter("subjects");
		score.setSubjectId(Integer.parseInt(sub));
		score.setStudentId(studentId);
		service.addScore(score);// need a addScore function in service that will
								// insert the score in the db for a particular
								// subject and for a particular student.

	}

}
