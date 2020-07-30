<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="web.app.StudentInformationSystem"%>
   <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
   
 <%@ page import= "com.google.appengine.api.datastore.DatastoreServiceFactory"%>
  <%@ page import= "com.google.appengine.api.datastore.Entity"%>
   <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
    <%@ page import= "com.google.appengine.api.datastore.DatastoreService"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datastore</title>
</head>
<body>
 <%
  StudentInformationSystem student =new  StudentInformationSystem();
 
  student.doGet(request, response);
  Entity studentPortal = student.show(request, response);
  session.setAttribute("student", studentPortal);
  out.print(studentPortal);
  out.print(studentPortal.getProperty("name"));
  studentPortal.setProperty("mark4", 66);
  out.print(studentPortal.getProperty("mark4"));
  
  //out.print("hey");
  
  
  %>
<h3> Student Datastore </h3>
  <form action="student.jsp">
  
  Name <input type="text" name="studentName"/>
  <input type ="submit" value="submit"/>
  </form>
 
</body>
</html>