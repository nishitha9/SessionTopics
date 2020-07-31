<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="web.app.*"%>
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

<h3> Student Datastore </h3>
  <form action="student.jsp">
  
  Name <input type="text" name="studentName"/>
  <input type ="submit" value="submit"/>
  </form>
 
</body>
</html>