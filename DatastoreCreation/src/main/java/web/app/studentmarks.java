package web.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PostalAddress;
import com.google.appengine.api.datastore.Text;

public class studentmarks extends HttpServlet {
	Entity studentForm;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	/*	
		
		 DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		  PrintWriter out=response.getWriter();
		PostalAddress add=new PostalAddress("chennai");
		add.getAddress();
		
		
		  
		  studentPortal=new Entity("Students","1");
		  studentPortal.setProperty("name",new Text("Nishitha")); //if string char is more than 1500 chars.
		  studentPortal.setProperty("id", 001);
		  studentPortal.setProperty("mark1",65);
		  studentPortal.setProperty("mark2",82);
		  studentPortal.setProperty("mark3",90);
		  studentPortal.setProperty("sportsMark1",72);
		  studentPortal.setProperty("sportsMark2",89);
		  studentPortal.setProperty("mark4", 82);
		
		 datastore.put(studentPortal);
		 
		  
		 Key key=e.getKey();
		  
		  
		
		  
		  try {
			Entity students= datastore.get(e.getKey());
			out.println(students.getProperty("mark3"));
			
			
		} catch (EntityNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
			 
		  out.println("Database updated");
		  out.println(e.getProperty("sportsMark1"));
		  out.println(key);
		  out.println(e.getKind());

		 
	 String name=request.getParameter("studentName");
	 studentPortal=new Entity(name,1);
	studentPortal.setProperty("name", name);
	out.println("Property name for kind: "+ name + " "+ studentPortal.getProperty("name"));

		
	DatastoreService service=DatastoreServiceFactory.getDatastoreService();
	service.put(studentPortal);
		  
	*/
		
	}
	public Entity show()
	{
	 return studentForm;
	}

}
