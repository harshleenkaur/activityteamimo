import java.util.*;
class Book                               //program for user defined 
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
	      this.id=id;
	      this.name=name;
	      this.author=author;
	      this.publisher=publisher;
	      this.quantity=quantity;
	}
}
public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //creating list of books
		List<Book> list = new ArrayList<Book>();
		//creating books
		Book b1 = new Book(101,"let us c","yashwant  kanetkar","BPB",8);
		Book b2 = new Book(102,"data communications and networking","Forouzan","Mc Graw Hill",4);
		Book b3 = new Book(103,"operating system","galvin","wiley",6);
		
		//adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		//traversing list
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
