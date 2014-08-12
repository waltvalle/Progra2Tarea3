
public class Perro extends Animal 
{
	// declaro la variable ladrar
	String ladrar;
	
	// establezco los parametros que tendra la clase Perro (nombre y edad)
	Perro(String nombre, int edad) 
	{
		// se manda a llamar los constructores de los metodos establecidos en la clase Animal
		super(nombre, edad);
	}
	
	// declaro la funcion ladrar que recibira lo que contiene la variable ladrar declarada al principio
	String ladrar()
	{
		// se retorna ladrar (variable)
		return ladrar;
	}
	

}
