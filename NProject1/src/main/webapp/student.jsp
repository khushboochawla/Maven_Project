<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

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
  
    <form method="POST" action='Controller'>
        Student ID : <input type="text" readonly="readonly" name="userid"
            value="${student.studentId}" /> <br /> 
        Name : <input
            type="text" name="name"
            value="${student.name}" /> <br /> 
          
            
             course : 
            <select>
            	<c:forEach items="${courses}" var="course">
            	
            	
            	<option value="${course.courseName}">${course.courseName}</option>
            </c:forEach>
            </select> <br /> 
               Semester : 
            <select>
            	<c:forEach items="${semesters}" var="semester">
            	
            	
            	<option value="${semester.semesterName}">${semester.semesterName}</option>
            </c:forEach>
            </select> <br /> 
            Subject : 
            <select>
            	<c:forEach items="${subjects}" var="subject">
            	
            	
            	<option value="${subject.subjectName}">${subject.subjectName}</option>
            </c:forEach>
            </select>  Score : <input
            type="text" name="score"
            value="${score.marks}" /> <br /> 
            <input
            type="submit" value="Add" /> <br /> 
      
         
             <input
            type="submit" value="Submit" />
    </form>
</body>
</html>