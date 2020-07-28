<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT INFORMATION</title>
</head>
<body>
<%

String password=request.getParameter("password");
if(password.equals("student"))
{
	RequestDispatcher rd=request.getRequestDispatcher("studentdetails.jsp");
	rd.forward(request,response);
	
}
else
{
	out.println("<i> Incorrect username or password </i>");
	RequestDispatcher rd= request.getRequestDispatcher("studentlogin.jsp");
	rd.include(request,response);
	
}


%>
</body>
</html>