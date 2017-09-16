import java.util.*;
public class Main {

	public static void main(String[] args) {
	    StudentGroup v= new StudentGroup(100);
	    Date d=new Date(5,9,1990);
	    Student s=new Student(20,"student",d,86.4);

	    v.getStudent(10);
	    v.setStudent(s,10);
	    System.out.println("index");
	    System.out.println("date"+d);


		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
