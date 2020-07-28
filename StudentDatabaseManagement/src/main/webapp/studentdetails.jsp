<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Database</title>
</head>
<body>
<%
out.print("<h3 style=\"text-align:center\">Welcome "+ request.getParameter("student_name") + " </h3>");
//out.println(session.getAttribute("student_name"));



%>

<form action="sports.jsp">
<table>
<tr>
<td> Get Sports Score</td> 
<td> <input type="submit" value="Sports Details"/> </td></tr>
</table>
</form>
<form action="study.jsp">
<table>
<tr>
<td> Get Academic Score</td><td> <input type="submit" value="Study Details"/> </td>
</tr>
</table>
</form>
<form action="report.jsp">
<table>
<tr> 
<td> Get Overall Report </td><td> <input type="submit" value="Student Report"/> </td>
</tr>
</table>
</form>
</body>
</html>
