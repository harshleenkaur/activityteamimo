import java.awt.*;
import java.util.List;
import java.util.ArrayList;
class PlayerList
{
	ArrayList playerArray;
	List subListObj;
	PlayerList()
	{
		playerArray = new ArrayList();
		subListObj = new ArrayList();
	}
	void add()
	{
		for(int ctr = 0;ctr<5;ctr++)
		{
			playerArray.add("meghna");
			playerArray.add("serena");
			playerArray.add("venus");
			playerArray.add("serena");
			System.out.println();
		}
	}
		void search()
		{
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("search for an object and return" + "the first and last position");
		System.out.println();
		System.out.println("first occurance of the string" +"\"serena\" is at position" + playerArray.indexOf("serena"));
		System.out.println("last occurance of the string" +"\"serena\" is at position" + playerArray.lastIndexOf("serena"));	
		System.out.println();	
		}
		void display()
		{
			System.out.println("=================================================");
			System.out.println("retrieve objects from the array list:");
			System.out.println();
			for(int ctr=0;ctr<playerArray.size();ctr++)
			{
				System.out.println(" " +playerArray.get(ctr));
			}
		}
		
		
		void extract()
		{
			System.out.println("============================================");
			System.out.println("extract a sublist and" + "then print the new list");
			System.out.println("==================================================");
			System.out.println();
			subListObj = playerArray.subList(5, playerArray.size());
			System.out.println("new sublist from index 5 to " +playerArray.size() +"is :" +subListObj);
			System.out.println();
		}
	}

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PlayerList obj = new PlayerList();
obj.add();
obj.search();
obj.display();
obj.extract();
	}

}
