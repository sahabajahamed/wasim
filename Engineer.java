package opps;

public class Engineer {
	String subject;
	int fees;
	

}
class mechanical extends Engineer
{
	public void subject()
	{
		System.out.println("SUBJECT : "+"heat transfer ," + "DOM ," + " CAD/CAM");
	}
	public void fees()
	{
		System.out.println("FEES "+ 20000);
		
	}
	
}
class CSE extends Engineer
{
	public void subject()
	{
		System.out.println( "SUBJECT : "+"  JAVA ," + "PYTHON ," + " C#");
		
	}
	public void fees()
	{
		System.out.println("FEES " +40000);
		
	}
	
}
class civil extends Engineer
{
	public void subject()
	{
		System.out.println( "SUBJECT : "+"bending moment ," + "operation ," + " strength of metrial");
		
		
	}
	public void fees()
	{
		System.out.println( "FEES :" + 35000);
		
	}
	
}
class automobile extends mechanical
{	
//	public void subject()
//	{
//	System.out.println( "SUBJECT : "+"bending moment" );
//	
//		
//	}
//	public void fees()
//	{
//		System.out.println("i dont have money");
//	}
	
	
}
