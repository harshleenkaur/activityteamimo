import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<StudentComparator> ar = new ArrayList<StudentComparator>();
ar.add(new StudentComparator(111,"bbbb","London"));
ar.add(new StudentComparator(131,"aaaa","nyc"));
ar.add(new StudentComparator(121,"cccc","jaipur"));

System.out.println("unsorted");
for(int i=0;i<ar.size();i++)
	System.out.println(ar.get(i));

Collections.sort(ar, new Sortbyroll());
System.out.println("\n sorted by roll no");
for(int i=0;i<ar.size();i++)
	System.out.println(ar.get(i));

Collections.sort(ar, new Sortbyname());

System.out.println("\n sorted by name");
for(int i=0;i<ar.size();i++)
	System.out.println(ar.get(i));
	}

}
