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
    <div id="maindiv" style="border:5px solid black; margin:50px auto; width:400px; height:300px">
        <div id="addstudent" style="margin:0 auto; width:165px; height:20px; border:1px solid white;padding-top: 20px">Add Student Details</div>
        <div id="childcontainer" style="padding:30px; border:1px solid white;">
        <div id="leftstudentid" style="float:left; border:1px solid white">
        Student ID :</div>
       
        <div id="rightstudentid" style="float:right; border:1px solid white">
        <input type="text" readonly="readonly" name="studentId"
            value="" /></div> <br />  <br /> 
       <div id="leftname" style="float:left; border:1px solid white ">
       Name :</div> 
       <div id="rightname" style="float:right; border:1px solid white">
       <input
            type="text" name="studentName"
            value="" /></div> <br />  <br /> 
        <div id="leftcourse" style="float:left; border:1px solid white">
        Course : </div>
        <div id="rightcourse" style="float:right; border:1px solid white">
        <input
            type="text" name="courseName"
            value="" /> </div><br />  <br /> 
        <div id="leftsubject" style="float:left; border:1px solid white">
        Subject:</div> 
        <div id="rightsubject" style="float:right; border:1px solid white">
        <input
            type="text" name="subjectName"
           value="" /></div> <br /> <br /> 
           <center>
             <input
            type="submit" value="Submit" />
            </center></div>
    </div>
    </form>
</body>
</html>