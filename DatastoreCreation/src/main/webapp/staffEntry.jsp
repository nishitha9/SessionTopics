<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Mark Details</title>
</head>
<body>
<h3> Enter Student Details </h3>
<form action="StudentInformationSystem">
<table>
<tr>
<td>Student Name </td> <td> <input type="text" name="studentName"/></td>
</tr>
<tr>
<td>Reg Number </td> <td> <input type="text" name="regno"/></td>
</tr>
<tr>
<td>Contact Details </td> <td> <input type="text" name="contact"/></td>
</tr>
<tr>
<td>DBMS Grade </td> <td> <select name="dbms">
<option value="S">S</option>
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
</select> </td>
</tr>
<tr>
<td>OS Grade</td> <td> <select name="os">
<option value="S">S</option>
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
</select></td>
</tr>
<tr>
<td>CNS Grade</td> <td> <select name="cns">
<option value="S">S</option>
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
</select></td>
</tr>
<tr>
<td>GPA</td> <td> <input type="text" name="gpa"/></td>
</tr>
<tr>
<td>CGPA</td> <td> <input type="text" name="cgpa"/></td>
</tr>
<tr>
<td> <input type="submit" value="submit"/>
</tr>
</table>
</form>

</body>
</html>