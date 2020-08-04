package web.app;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.KeyFactory.Builder;
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
		response.setContentType("text/html");
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
		
		EmbeddedEntity contactInfo =new EmbeddedEntity();
		contactInfo.setProperty("address", "chennai");
		contactInfo.setProperty("Pincode","600189");
		contactInfo.setProperty("Country","India");
		
		studentForm.setProperty("Address", contactInfo);
		datastore.put(studentForm);
		
		Entity e1=new Entity("Organisation");
		Key key=e1.getKey();
		out.println(key);
		datastore.put(e1);
		Key key1=new KeyFactory.Builder("Organisation","rootnode1").addChild("Manager", "rootnode2").addChild("Labours", "rootnode3").getKey();
		
		out.println(key1);
	/*	Key key=studentForm.getKey();
		Entity e1=datastore.get(key);
		System.out.print("Entity: "+ e1);
		out.print("key: "+  key);
		*/
		
		Query query=new Query("Students").addFilter("DBMS", FilterOperator.GREATER_THAN, 5.0);
		PreparedQuery pq1=datastore.prepare(query);
		for(Entity i:pq1.asIterable())
		{
			out.println(studentForm.getProperty("Name"));
			
		}
		
		
	
		out.print("Student Added!!!");
		out.println("<a href=\"studentmarks.jsp\"><button>View Entry</button></a>");
		HttpSession session=request.getSession();
		session.setAttribute("Entity", studentForm); 
  }
  
  
  public Entity show()
  {
	  return studentForm;
  }
  
}