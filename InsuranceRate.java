
public class InsuranceRate {
	protected InsuranceRate() {}
	
	public static int calculateRate(final String birth)throws Exception
	{
		final int year = 2019;
			int age = 0;
			int birthYear = Integer.parseInt(birth);
			age = year - birthYear;
			if(age < 16)
			{
				System.out.println("age is:" +age);
				throw new Exception();
			}
			else
			{
				int drivenYears = age-16;
				if (drivenYears < 4)
				{
					return 1000;
				}
				else
				{
					return 600;
				}
			}
		}
}
