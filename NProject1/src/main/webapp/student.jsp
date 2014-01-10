<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
    href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Add new Student Data</title>
</head>
<body>
   
    <form method="POST" action='StudentController'>
        Student ID : <input type="text" readonly="readonly" name="studentId"
            value="${student.studentId}" /> <br /> 
       Name : <input
            type="text" name="studentName"
            value="${student.studentName}" /> <br /> 
        Course : <input
            type="text" name="courseName"
            value="${course.courseName}" /> <br /> 
        Subject: <input
            type="text" name="subjectName"
           value="${subject.subjectName}" /> <br />
           
             <input
            type="submit" value="Submit" />
    </form>
</body>
</html>