
public class GenericMethodTest {

	public static<E> void printArray(E[] inputArray)   //generic method printarray
	{
		for(E element:inputArray)            //display array elements
		{
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create arrays of int,double,char
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
        System.out.println("Array integer array contains:");
        printArray(intArray);  //pass an int array
        
        System.out.println("\n Array double array contains:");
        printArray(doubleArray);  //pass an double array
        
        System.out.println("\n Array char array contains:");
        printArray(charArray);  //pass an char array
	}

}
