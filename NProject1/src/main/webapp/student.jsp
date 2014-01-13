<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
	href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Add new student data</title>
</head>
<body>

		<form method="POST" action='Controller' name="frmAddUser">
			Student ID : <input type="text" readonly="readonly" name="studentid"
				value="${student.studentId}" /> <br /> Name : <input type="text"
				name="studentname" value="${student.name}" /> <br /> course : <select
				name="courses">
				<c:forEach items="${courses}" var="course">
	
	
					<option value="${course.courseId}">${course.courseName}</option>
				</c:forEach>
			</select> <br /> Semester : <select name="semesters">
				<c:forEach items="${semesters}" var="semester">
	
	
					<option value="${semester.semesterId}">${semester.semesterName}</option>
				</c:forEach>
			</select> <br /> Subject : <select name="subjects">
				<c:forEach items="${subjects}" var="subject">
	
	
					<option value="${subject.subjectId}">${subject.subjectName}</option>
				</c:forEach>
			</select> 
			Score : <input type="text" name="score" value="${score.marks}" /> <br />

	
			<input type="submit" value="Submit" />
		</form>
</body>
</html>