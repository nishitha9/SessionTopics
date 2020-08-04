package web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.repackaged.com.google.datastore.v1.client.DatastoreOptions;

public class Querying extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out=response.getWriter();
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
	
	
		 Query query=new Query("Students").addFilter("RegNo",FilterOperator.EQUAL,request.getParameter("studentID"));
			PreparedQuery pq=datastore.prepare(query);
			for(Entity studentEntities: pq.asIterable())
			{
				out.println("Name: "+ studentEntities.getProperty("Name"));
				out.println("Reg No: "+ studentEntities.getProperty("RegNo"));
				out.println("DBMS Grade: "+ studentEntities.getProperty("DBMS"));
				out.println("OS Grade: "+ studentEntities.getProperty("OS"));
				out.println("CNS Grade: "+ studentEntities.getProperty("CNS"));
				out.println("GPA: "+ studentEntities.getProperty("GPA"));
				out.println("CCGPA: "+ studentEntities.getProperty("CGPA"));
				out.println("Date Added: "+ studentEntities.getProperty("Date Added"));
			
				
			}
			int id=Integer.parseInt(request.getParameter("studentID"));
			if(id>=13)
			{
				out.println("User not registered yet!!");
			}
			
			
	
	}
	

}
