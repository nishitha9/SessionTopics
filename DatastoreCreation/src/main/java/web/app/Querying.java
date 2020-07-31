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

public class Querying extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		 DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		 Entity student=(Entity)session.getAttribute("Entity");
		 Map<String,Object> studentMap=student.getProperties();
		 Set<String> key=studentMap.keySet();
		 for(String i:key)
		 {
			 out.println(i+ " "+studentMap.get(i));
		 }
	//	 out.print(student.getProperty("OS"));
	//	 out.println(student.getProperty("Name"));
		 

	
	}
	

}
