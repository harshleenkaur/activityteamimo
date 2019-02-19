import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class myBasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> p = new ArrayList<String>();
//add elements to arraylist
p.add("java");
p.add("python");
p.add("c++");
p.add("c");
p.add("cobol");
System.out.println(p);
//get elements by index
System.out.println("elements at index 1:" +p.get(1));
System.out.println("does list contain java? " +p.contains("java"));
//add elements at a specific index
p.add(2,"PLAY");
System.out.println(p);
System.out.println("is arraylist empty? "+p.isEmpty());
System.out.println("index of perl is " +p.indexOf("perl"));
System.out.println("size of the arraylist is:" +p.size());
Collections.sort(p);
System.out.println(p);
	}
}
