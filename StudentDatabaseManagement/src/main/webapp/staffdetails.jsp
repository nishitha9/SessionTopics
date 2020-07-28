<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="we.app.sdb.*" %>
<%@ page import="java.lang.Integer.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT WEB PORTAL</title>
</head>
<style>
#heading
{
text-align:center;
color:black;
background-color:#789768;
height:60px;
padding-top:1px;
}
#logout
{
text-align:right;

}

</style>
<body bgcolor="#E9D7D7">
<div id="heading">
<h3>STUDENT INFORMATION PORTAL</h3>
</div>
<div id="logout">
<form action="logout.jsp">
<input type="submit" value="logout"/>
</form>
</div>
<%= "<h3 > <i>Welcome "+ request.getParameter("staff_name") + "</i></h3>" %>
<h3 style="text-align:center"> Student Details </h3>

<% 
StudentDatabaseMap sdb=new StudentDatabaseMap();
sdb.create();
HashMap <String,Student> student_map=new HashMap<>();
student_map=sdb.show();
%>
<table style="border:1px solid black;margin-left:auto;margin-right:auto;text-align:center;">
<tr >
<td > Name </td> 
<td > Study Mark 1</td>
<td> Study Mark 2</td>
<td> Study Mark 3</td>
<td> Sports Mark 1</td>
<td> Sports Mark 2</td>

</tr>

<% 
Set<String> key=student_map.keySet();
for(String i:key)
	{
	
			out.println("<tr>");		
			out.println("<td>"+ student_map.get(i).name +"</td>"  );
			out.println("<td>"+ student_map.get(i).mark1 +"</td>" );
			out.println("<td>"+ student_map.get(i).mark2+"</td>" );
			out.println("<td>"+ student_map.get(i).mark3 +"</td>" );
			out.println("<td>"+ student_map.get(i).sports_mark1 +"</td>" );
			out.println("<td>"+ student_map.get(i).sports_mark2 +"</td>" );
			out.println("</tr>");
		
		}
	
%>


</table>
</body>
</html>