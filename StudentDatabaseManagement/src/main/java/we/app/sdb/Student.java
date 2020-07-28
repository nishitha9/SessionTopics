package we.app.sdb;

public class Student {
	public String name;
	   public int mark1;
	   public int mark2;
	   public int mark3;
	   public int sports_mark1;
	   public int sports_mark2;

	    public Student(String name,int mark1,int mark2,int mark3,int sports_mark1,int sports_mark2)
	    {
	        this.name=name;
	        this.mark1=mark1;
	        this.mark2=mark2;
	        this.mark3=mark3;
	        this.sports_mark1=sports_mark1;
	        this.sports_mark2=sports_mark2;
	    }
	    public String toString()
	    {
	        return (" Name:"+ name+ " StudyMark1:"+ mark1+ " StudyMark2:"+ mark2+ " StudyMark3:"+ mark3+ " SportsMark1:"+ sports_mark1+" SportsMark2:"+ sports_mark2);


	    }


}
