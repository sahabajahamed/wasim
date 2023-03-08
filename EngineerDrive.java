package opps;

public class EngineerDrive {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String []args)
	{
	civil civil = new civil();
		civil.subject();
		civil.fees();
		mechanical mech= new mechanical();
		mech.subject();
		mech.fees();
	
		CSE cs= new CSE();
		Engineer eng=cs;
		
		cs.subject();
		cs.fees();
		
		automobile auto= new automobile();
		auto.subject();
		auto.fees();
		
		
		
		
				
	}

}
