
public class Gato extends Animal
{
	
	// declaro la variable maullar
	String maullar;

	// declaro la funcion maullar que recibira lo que contiene la variable maullar declarada al principio
	String maullar()
	{
		// se retorna maullar (variable)
		return maullar;
	}
	
	// establezco los parametros que tendra la clase Perro (nombre y edad)
	Gato(String nombre, int edad) 
	{
		// se manda a llamar los constructores de los metodos establecidos en la clase Animal
		super(nombre, edad);
	}

}
