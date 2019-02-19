import java.util.Scanner;
public class GenericPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pair<String> secretPair = new Pair<String>("Happy" , "Day");
       Scanner keyboard = new Scanner(System.in);
    		   System.out.println("enter two words");
       String word1 = keyboard.next();
       String word2 = keyboard.next();
       Pair<String> inputPair = new Pair<String>(word1,word2);
       
       Pair<Integer> secretPair1 = new Pair<Integer>(10,20);
secretPair1.display();
       if(inputPair.equals(secretPair))
       {
    	   System.out.println("you guessed the secret words");
    	   System.out.println("in the correct order");
    	   
       }
       else
       {
    	   System.out.println("you guessed incorrectly");
    	   System.out.println("you guessed");
    	   System.out.println(inputPair);
    	   System.out.println("the secret words are");
    	   System.out.println(secretPair);
       }
	}

}
