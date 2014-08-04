import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;


public class Evaluar {

	@Test
	public void clasePerro()
	{
		Perro p = new Perro("",4);
		if(!(p instanceof Animal))
		{
			fail("Perro no hereda de animal");
		}
	}
	
	@Test
	public void claseGato()
	{
		Gato g = new Gato("",4);
		if(!(g instanceof Animal))
		{
			fail("Gato no hereda de Animal");
		}
	}
	
	@Test
	public void claseLoro()
	{
		Loro l = new Loro("",4);
		if(!(l instanceof Animal))
		{
			fail("Loro no hereda de Animal");
		}
	}
	
	@Test
	public void constructorLoro()
	{
		Loro l = new Loro("gugu",20);
		if(!l.nombre.equals("gugu"))
		{
			fail("Constructor de loro mal implementado.");
		}
		if(l.edad != 20)
		{
			fail("Constructor de loro mal implementado.");
		}
	}
	
	@Test
	public void constructorPerro()
	{
		Perro p = new Perro("gaga",10);
		if(!p.nombre.equals("gaga"))
		{
			fail("Constructor de loro mal implementado.");
		}
		if(p.edad != 10)
		{
			fail("Constructor de loro mal implementado.");
		}
	}
	@Test
	public void constructorGato()
	{
		Gato p = new Gato("gege",15);
		if(!p.nombre.equals("gege"))
		{
			fail("Constructor de loro mal implementado.");
		}
		if(p.edad != 15)
		{
			fail("Constructor de loro mal implementado.");
		}
	}
	
	@Test
	public void setGet()
	{
		Gato p = new Gato("gege",15);
		p.setNombre("gogo");
		p.setEdad(10);
		if(!p.getNombre().equals("gogo"))
		{
			fail("Constructor de loro mal implementado.");
		}
		if(p.getEdad() != 10)
		{
			fail("Constructor de loro mal implementado.");
		}
	}
	@Test
	public void ladrar()
	{
		(new Perro("", 0)).ladrar();
	}
	
	@Test
	public void maullar()
	{
		(new Gato("", 0)).maullar();
	}
	
	@Test
	public void hablar()
	{
		(new Loro("", 0)).hablar();
	}
}