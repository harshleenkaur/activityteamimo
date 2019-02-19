
public class InsuranceCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       InsuranceRate obj = new InsuranceRate();
		       String inData = "1997";
		       try {
		    	   System.out.println("your insurance is:" +obj.calculateRate(inData));
		       }
		       catch(Exception oops)
		       {
		    	   System.out.println("too young for insurance");
		       }
			}

		}
