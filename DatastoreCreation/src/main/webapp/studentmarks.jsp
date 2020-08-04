<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
   
 <%@ page import= "com.google.appengine.api.datastore.DatastoreServiceFactory"%>
  <%@ page import= "com.google.appengine.api.datastore.Entity"%>
   <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
    <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
    <%@ page import="web.app.studentmarks" %>
    <%@ page import="java.util.Map" import="java.util.Set" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Marks</title>
</head>
<body>
<form action="Querying">

Enter your Reg Number<input type="text" name="studentID">
<input type="submit" value="submit"/>

</form>
<%
/*
studentmarks student=new studentmarks();
student.doGet(request, response);
Entity studentEntity=student.show();
Map<String,Object> map=studentEntity.getProperties();
Set<String> key=map.keySet();
for(String i:key)
{
	out.print("<br>");
	out.print(map.get(i)+ "Key: "+ i);
	out.print("<br>");
}
out.print("<br>");
out.print(studentEntity.getProperty("demo"));
out.print(studentEntity.getKind());
out.print("<br>");
out.println("hey");
*/
%>
</body>
</html>