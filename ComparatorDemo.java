import java.util.*;


public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();
		System.out.println(d1.toString());
ArrayList<StudentComparator> ar = new ArrayList<StudentComparator>();
ar.add(new StudentComparator(111,"bbbb","london"));
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

Collections.sort(ar, new Sortbyaddress());
System.out.println("\n sorted by address");

for(int i=0;i<ar.size();i++)
	System.out.println(ar.get(i));
	}

}
