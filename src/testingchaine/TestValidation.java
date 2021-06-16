package testingchaine;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import testingchaine.validation.Valide;

public class TestValidation {
Valide v;
@Before
public void initialise()
{
		v=new Valide();
}
@Test
public void notnull()
{
assertTrue(v.verifNotNull("teste"));	
}
}
