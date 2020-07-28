<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="we.app.sdb.*" %>
<%@ page import="java.lang.Integer.*" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
<%@ page errorPage="error.jsp" %>
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
<%= "<h3 > <i>Welcome "+ request.getParameter("student_name") + "</i></h3>" %>
<h3 style="text-align:center"> Student Details </h3>

<% 
String name=request.getParameter("student_name");
StudentDatabaseMap sdb=new StudentDatabaseMap();
sdb.create();
HashMap <Integer,Student> student_map=new HashMap<>();
student_map=sdb.show();
int key=0;
for(Map.Entry<Integer,Student>entry:student_map.entrySet())
{
    if(entry.getValue().name.equals(name))
        key = entry.getKey();
}
%>
<table style="border:1px solid black;margin-left:auto;margin-right:auto;text-align:center;">
<tr >
<td> Student_id </td>
<td > Name </td> 
<td > Study Mark 1</td>
<td> Study Mark 2</td>
<td> Study Mark 3</td>
<td> Sports Mark 1</td>
<td> Sports Mark 2</td>

</tr>

<% 

			out.println("<tr>");
			out.println("<td>"+ student_map.get(key).student_id+"</td>"  );
			out.println("<td>"+ student_map.get(key).name +"</td>"  );
			out.println("<td>"+ student_map.get(key).mark1 +"</td>" );
			out.println("<td>"+ student_map.get(key).mark2+"</td>" );
			out.println("<td>"+ student_map.get(key).mark3 +"</td>" );
			out.println("<td>"+ student_map.get(key).sports_mark1 +"</td>" );
			out.println("<td>"+ student_map.get(key).sports_mark2 +"</td>" );
			out.println("</tr>");
		
		
	
%>


</table>
</body>
</html>