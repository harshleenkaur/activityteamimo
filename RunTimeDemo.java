
public class RunTimeDemo {
	protected RunTimeDemo()
	{}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
   Runtime objRun = Runtime.getRuntime();
   Process objProcess = null;
   try {
	   objProcess = objRun.exec("calc.exe");
	   System.out.println(objRun.freeMemory());
	   System.out.println(System.getProperty("java.vendor"));
	   System.out.println(System.getProperty("java.version"));
   }
   catch(Exception e)
   {
	   System.out.println("error executing calculator");
   }
	}

}
