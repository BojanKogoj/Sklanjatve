package source;



public class Sklanjatve
{
	/*
	 * ustvaril Bojan Kogoj (bojan.kogoj@gmail.com)
	 * https://github.com/ohnoes/Sklanjatve
	 * primer: https://play.google.com/store/apps/details?id=edu.vreme
	 */

	public static final int SEKUNDA = 0;
	public static final int MINUTA = 1;
	public static final int URA = 2;
	public static final int DAN = 3;
	public static final int MESEC = 4;
	public static final int LETO = 5;
	
	private final static int SECOND = 1;
	private final static int MINUTE = 60 * SECOND;
	private final static int HOUR = 60 * MINUTE;
	private final static int DAY = 24 * HOUR;
	private final static int MONTH = 30 * DAY;

	public static String sklanjaj(int n, int kateri)
	{
		String res = "pred " + n;
		if (kateri < 3)
		{
			if (kateri == SEKUNDA)
				res += " sekund";
			else if (kateri == MINUTA)
				res += " minut";
			else //URA
				res += " ur";

			if (n == 1)
				res += "o";
			else if (n == 2)
				res += "ama";
			else
				res += "ami";
		}
		else if (kateri == DAN)
		{
			res += " dne";
			if(n == 1)
				res += "m";
			else if (n == 2)
				res += "voma";
			else
				res += "vi";
		}
		else if (kateri == MESEC)
		{
			res += " mesec";
			if (n == 1)
				res += "em";
			else if ( n == 2)
				res += "ema";
			else
				res += "i";
		}
		else
		{
			res += " let";
			if (n == 1)
				res += "om";
			else if (n == 2)
					res += "oma";
				else
				res += "i";
		}
		return res;
	}
	
	/**
	 * @param delta je casovna razlika med sedaj in preteklim casom
	 * @return String v obliki "pred 3 dnevi"
	 */
	public static String sklanjaj(int delta)
	{
		if (delta < 0)
		{
			return "še ni?!";
		}
		if (delta < 1 * MINUTE)
		{
			return delta == 1 ? "pred eno sekundo" : Sklanjatve.sklanjaj(delta, Sklanjatve.SEKUNDA);
		}
		if (delta < 2 * MINUTE)
		{
			return "pred eno minuto";
		}
		if (delta < 45 * MINUTE)
		{
			return Sklanjatve.sklanjaj( delta / MINUTE, Sklanjatve.MINUTA);
		}
		if (delta < 90 * MINUTE)
		{
			return "pred eno uro";
		}
		if (delta < 24 * HOUR)
		{
			return Sklanjatve.sklanjaj( delta / HOUR, Sklanjatve.URA);
		}
		if (delta < 48 * HOUR)
		{
			return "vèeraj";
		}
		if (delta < 30 * DAY)
		{
			return Sklanjatve.sklanjaj( delta / DAY , Sklanjatve.DAN);
		}
		if (delta < 12 * MONTH)
		{
			int months = (delta / DAY) / 30 ;
			return months <= 1 ? "pred enim mescem" : Sklanjatve.sklanjaj(months, Sklanjatve.MESEC);
		}
		else
		{
			int years = (delta / DAY) / 365;
			return years <= 1 ? "pred enim letom" : Sklanjatve.sklanjaj(years, Sklanjatve.LETO);
		}
		
		
	
	}
}
