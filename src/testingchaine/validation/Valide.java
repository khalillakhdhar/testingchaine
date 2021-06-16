package testingchaine.validation;

public class Valide {
	public boolean verifNotNull(String ch)
	{
		return !ch.isBlank();
	}
	public boolean veriflength(String ch)
	{
		if(ch.length()>10)
			return true;
		else 
			return false;
		//return ch.length()>10
		
	}
	
	

}
