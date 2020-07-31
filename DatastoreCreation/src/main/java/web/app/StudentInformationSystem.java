package web.app;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PostalAddress;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Text;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StudentInformationSystem extends HttpServlet {
	Entity studentForm;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  try {
		createStudent(request,response);
	} catch (EntityNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
  }
  
public void createStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, EntityNotFoundException
  {
	  PrintWriter out=response.getWriter();
	//	response.setContentType("text/html");
	  Date date=new Date();
	  SimpleDateFormat sdf=new SimpleDateFormat("mm:dd:yyyy");
	  sdf.format(date);
	 
	  
		
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();

		studentForm=new Entity("Students",request.getParameter("regno"));
		studentForm.setProperty("Name",request.getParameter("studentName"));
		studentForm.setProperty("RegNo",request.getParameter("regno"));
		studentForm.setProperty("DBMS",request.getParameter("dbms"));
		studentForm.setProperty("OS",request.getParameter("os"));
		studentForm.setProperty("CNS",request.getParameter("cns"));
		studentForm.setProperty("GPA",request.getParameter("gpa"));
		studentForm.setProperty("CGPA",request.getParameter("cgpa"));
		studentForm.setProperty("Date added", date);
		
		datastore.put(studentForm);
	/*	Key key=studentForm.getKey();
		Entity e1=datastore.get(key);
		System.out.print("Entity: "+ e1);
		out.print("key: "+  key);
		*/
		
		Query query=new Query("Students").addFilter("RegNo",FilterOperator.EQUAL,"5");
		PreparedQuery pq=datastore.prepare(query);
		for(Entity studentEntities: pq.asIterable())
		{
			out.println(studentEntities.getProperty("Name"));
			out.println(studentEntities.getProperty("RegNo"));
			out.println(studentEntities.getProperty("DBMS"));
			out.println(studentEntities.getProperty("OS"));
			out.println(studentEntities.getProperty("CNS"));
			out.println(studentEntities.getProperty("GPA"));
			out.println(studentEntities.getProperty("CGPA"));
			out.println(studentEntities.getProperty("Date Added"));
			
		}
		
		out.print("Student Added!!!");
//		out.println("<a href=\"Querying\"><button>View Entry</button></a>");
		HttpSession session=request.getSession();
		session.setAttribute("Entity", studentForm); 
  }
  
  
  public Entity show()
  {
	  return studentForm;
  }
  
}