package web.app;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentInformationSystem extends HttpServlet {
	Entity studentPortal;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  PrintWriter out=response.getWriter();
	  
	  studentPortal=new Entity("Students","1");
	  studentPortal.setProperty("name", "Nishitha"); 
	  studentPortal.setProperty("id", 001);
	  studentPortal.setProperty("mark1",62);
	  studentPortal.setProperty("mark2",92);
	  studentPortal.setProperty("mark3",100);
	  studentPortal.setProperty("sportsMark1",62);
	  studentPortal.setProperty("sportsMark2",89);
	  studentPortal.setProperty("mark4", 689);
	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  datastore.put(studentPortal);
	/*  Key key=e.getKey();
	  
	  
	
	  
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
  
  public void createStudent(HttpServletRequest request, HttpServletResponse response)
  {
	  
  }
  
  public Entity show(HttpServletRequest request, HttpServletResponse response)
  {
	  return studentPortal;
  }
  
}