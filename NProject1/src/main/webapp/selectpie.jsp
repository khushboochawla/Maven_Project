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

<select name="class">
<option value="CSE">CSE</option>
<option value="EC">EC</option>
<option value="ME">ME</option>
<option value="EN">EN</option>
</select><br>

</td>
</tr>
<tr>
<td align="right">
Choose Semester:
</td>
<td align="left">
<select name="semester">
<option value="">1</option>
<option value="">2</option>
<option value="">3</option>
<option value="">4</option>
</select><br>
</td>
</tr>
<tr>
<td align="right">
CHOOSE SUBJECT:
</td>
<td align="left">
<select name="subject">
<option value="">1</option>
<option value="">2</option>
<option value="">3</option>
<option value="">4</option>
</select>
</td>
</tr>

</table>




  



  <input type=submit name="drawPie"> <input type=reset name ="reset" value=reset> 
</body>
</html>