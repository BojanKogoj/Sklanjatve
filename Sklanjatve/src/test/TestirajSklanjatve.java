package test;

import source.Sklanjatve;

public class TestirajSklanjatve
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Testiranje Sklanjatev...");
		System.out.println();
		
		TestirajVse();
		System.out.println();
		
		Sekunda();
		System.out.println();
		Minuta();
		System.out.println();
		Ura();
		System.out.println();
		Dan();
		System.out.println();
		Mesec();
		System.out.println();
		Leto();

	}
	
	protected static void TestirajVse()
	{
		System.out.println("-SEKUNDA: 1, 2, 3, 59");
		System.out.println(Sklanjatve.sklanjaj(1));
		System.out.println(Sklanjatve.sklanjaj(2));
		System.out.println(Sklanjatve.sklanjaj(3));
		System.out.println(Sklanjatve.sklanjaj(59));
		System.out.println();
		
		System.out.println("-MINUTA: 1, 2, 3");
		System.out.println(Sklanjatve.sklanjaj(60));
		System.out.println(Sklanjatve.sklanjaj(120));
		System.out.println(Sklanjatve.sklanjaj(180));
		System.out.println();
		
		System.out.println("-PRED ENO URO");
		System.out.println(Sklanjatve.sklanjaj(3600));
		
		System.out.println("-URA: 1, 2, 3");
		System.out.println(Sklanjatve.sklanjaj(6000));
		System.out.println(Sklanjatve.sklanjaj(7200));
		System.out.println(Sklanjatve.sklanjaj(10800));
		System.out.println();
		
		System.out.println("-VCERAJ");
		System.out.println(Sklanjatve.sklanjaj(100000));
		
		System.out.println("-DAN: 2, 3");
		System.out.println(Sklanjatve.sklanjaj(172800));
		System.out.println(Sklanjatve.sklanjaj(259200));
		System.out.println();
		
		System.out.println("-MESEC: 1, 2, 3");
		System.out.println(Sklanjatve.sklanjaj(2678400));
		System.out.println(Sklanjatve.sklanjaj(5529600));
		System.out.println(Sklanjatve.sklanjaj(2678400*3));
		System.out.println();
		
		System.out.println("-LETO: 1, 2, 3");
		System.out.println(Sklanjatve.sklanjaj(2678400*12));
		System.out.println(Sklanjatve.sklanjaj(2678400*24));
		System.out.println(Sklanjatve.sklanjaj(2678400*36));
		System.out.println();
	}
	
	
	protected static void Sekunda()
	{
		System.out.println("Test: 1, 2, 3, 59");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.SEKUNDA));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.SEKUNDA));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.SEKUNDA));
		System.out.println( Sklanjatve.sklanjaj(59, Sklanjatve.SEKUNDA));
	} 
	
	protected static void Minuta()
	{
		System.out.println("Test: 1, 2, 3, 59");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.MINUTA));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.MINUTA));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.MINUTA));
		System.out.println( Sklanjatve.sklanjaj(59, Sklanjatve.MINUTA));
	}
	
	protected static void Ura()
	{
		System.out.println("Test: 1, 2, 3, 59");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.URA));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.URA));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.URA));
		System.out.println( Sklanjatve.sklanjaj(59, Sklanjatve.URA));
	}
	
	protected static void Dan()
	{
		System.out.println("Test: 1, 2, 3, 30");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.DAN));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.DAN));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.DAN));
		System.out.println( Sklanjatve.sklanjaj(30, Sklanjatve.DAN));
	}
	
	protected static void Mesec()
	{
		System.out.println("Test: 1, 2, 3, 11");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.MESEC));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.MESEC));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.MESEC));
		System.out.println( Sklanjatve.sklanjaj(11, Sklanjatve.MESEC));
	}
	
	protected static void Leto()
	{
		System.out.println("Test: 1, 2, 3, 15");
		System.out.println( Sklanjatve.sklanjaj(1, Sklanjatve.LETO));
		System.out.println( Sklanjatve.sklanjaj(2, Sklanjatve.LETO));
		System.out.println( Sklanjatve.sklanjaj(3, Sklanjatve.LETO));
		System.out.println( Sklanjatve.sklanjaj(15, Sklanjatve.LETO));
	}
	

}
