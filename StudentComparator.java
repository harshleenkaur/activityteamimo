import java.util.Comparator;

public class StudentComparator {
	int rollno;
	String name,address;
	
	//constructor
	public StudentComparator(int rollno, String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	//used to print student details in main()
	public String toString()
	{
		return this.rollno+ " " + this.name + " " + this.address;
	}

}

class Sortbyroll implements Comparator<StudentComparator>
{
	//used for sorting in ascending order of roll no
	public int compare(StudentComparator a,StudentComparator b)
	{
		return a.rollno - b.rollno;
	}
}
class Sortbyname implements  Comparator<StudentComparator>
{
	//order of roll name
	public int compare(StudentComparator a,StudentComparator b) {
		return a.name.compareTo(b.name);
	}
}