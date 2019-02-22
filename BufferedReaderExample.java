import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	BufferedReader br = new BufferedReader (new FileReader(new File ("d:\\sample\\test.txt")));
	String line = " ";
	while((line=br.readLine())!=null )
{
	System.out.println(line);
}
br.close();
}
catch(FileNotFoundException e)
{
	System.out.println("file not exists or insufficients rights");;
	e.printStackTrace();
	
}
catch(IOException e)
{
	System.out.println("an exception occurred while reading the file");
	e.printStackTrace();
}
	}

	private static Reader newFileReader(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}
