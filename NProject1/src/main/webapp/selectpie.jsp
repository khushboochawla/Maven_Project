<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose Pie details</title>
</head>

<body>
<table>
<tr>
<td align="right">
Class:
</td>
<td align="left">


 <select
			name="courses">
			<c:forEach items="${courses}" var="course">


				<option value="${course.courseId}">${course.courseName}</option>
			</c:forEach>
			</select><br/>

</td>
</tr>
<tr>
<td align="right">
Choose Semester:
</td>
<td align="left">
  <select name="semesters">
		<c:forEach items="${semesters}" var="semester">


			<option value="${semester.semesterId}">${semester.semesterName}</option>
			</c:forEach>
		</select> <br /> 
</td>
</tr>
<tr>
<td align="right">
CHOOSE SUBJECT:
</td>
<td align="left">
  <select name="subjects">
			<c:forEach items="${subjects}" var="subject">


				<option value="${subject.subjectId}">${subject.subjectName}</option>
			</c:forEach>
		</select> 
</td>
</tr>

</table>




  



  <input type=submit name="drawPie"> <input type=reset name ="reset" value="reset"> 
</body>
</html>
