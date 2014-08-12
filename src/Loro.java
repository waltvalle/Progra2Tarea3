
public class Loro extends Animal
{

	// declaro la variable hablar
	String hablar;
	
	// declaro la funcion hablar que recibira lo que contiene la variable hablar declarada al principio
	String hablar()
	{
		// se retorna hablar (variable)
		return hablar;
	}
	
	// establezco los parametros que tendra la clase Perro (nombre y edad)
	Loro(String nombre, int edad) 
	{
		// se manda a llamar los constructores de los metodos establecidos en la clase Animal
		super(nombre, edad);
	}
}
