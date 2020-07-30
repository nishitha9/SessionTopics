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

public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  PrintWriter out=response.getWriter();
	  
	  Entity e=new Entity("Students","1");
	  e.setProperty("name", "Nishitha"); 
	  e.setProperty("id", 001);
	  e.setProperty("mark1",62);
	  e.setProperty("mark2",92);
	  e.setProperty("mark3",100);
	  e.setProperty("sportsMark1",62);
	  e.setProperty("sportsMark2",89);
	  
	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  datastore.put(e);
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
 out.println(name);
Entity studentPortal=new Entity(name,1);
studentPortal.setProperty("name", name);
out.println("Property name for kind: "+ name + " "+ studentPortal.getProperty("name"));

	
DatastoreService service=DatastoreServiceFactory.getDatastoreService();
service.put(studentPortal);
	  

  }
}