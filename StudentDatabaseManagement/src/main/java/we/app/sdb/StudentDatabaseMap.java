package we.app.sdb;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentDatabaseMap {

	HashMap<String,Student> stu_list=new HashMap<>();
//	HashMap<String,List<Object>> stu_list1=new HashMap<>();
//	List<Object> list=new ArrayList<>();

public void create()
{
	Student s1=new Student("Nishitha",67,90,56,78,56);
	Student s2=new Student("John Abrahim",45,70,96,45,89);
	Student s3=new Student("Richard Williams",23,67,45,90,45);
	Student s4=new Student("Micheal Kohr",87,20,55,73,90);
	Student s5=new Student("Jenna Sue",57,92,78,45,88);
	//list.add(12);
	//list.add(15);
	//list.add(34);
	//stu_list1.put("Nishitha", list);
	
	stu_list.put(s1.name, s1);
	stu_list.put(s2.name, s2);
	stu_list.put(s3.name, s3);
	stu_list.put(s4.name, s4);
	stu_list.put(s5.name, s5);	
	
}
	public HashMap<String,Student> show()
	{
		return stu_list;
	}


}
