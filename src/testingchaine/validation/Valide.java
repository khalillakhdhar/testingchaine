package testingchaine.validation;


public class Valide {
	public boolean verifNotNull(String ch)
	{
		return !ch.isBlank();
	}
	public boolean veriflength(String ch)
	{
//		if(ch.length()>10)
//			return true;
//		else 
//			return false;
		return ch.length()>10;
		
	}
	
	public boolean verifmots( String ch)
	{
		int count=0; //initialisation
		ch=ch.trim(); //�liminer les espances avant et apr�s
		for(int i=0;i<=ch.length()-1;i++ )
		{
			if(ch.charAt(i)==' ')
			{
				count++;
			}
		}
		return count>=2;
	}

}
