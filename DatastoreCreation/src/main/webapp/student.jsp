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
<title>Student</title>
</head>
<body>
<%
Entity sdb=(Entity)session.getAttribute("student");
//sdb.doGet(request, response);
//Entity student=sdb.show(request, response);
out.println(sdb.getProperty("mark4"));


%>
</body>
</html>