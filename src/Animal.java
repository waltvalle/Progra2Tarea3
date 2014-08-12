
// NO USE NINGUNA FUENTE EXTERNA MAS QUE LA AYUDA DE MI PAPA.

public class Animal 
{
	// Declaro las variables nombre y edad
	String nombre;
	int edad;
	
	// introduzco los parametros que tendra la clase animal (nombre y edad)
	Animal(String nombre, int edad)
	{
		// establezco que esos parametros seran iguales a las variables declaradas anteriormente
		this.nombre = nombre;
		this.edad =  edad;
	}
	
	// creo el metodo Nombre (string) que retornara lo que tiene la variable nombre  
	String getNombre()
	{
		return nombre;
	}
	
	// creo el metodo Edad (int) que retornara lo que tiene la variable edad
	int getEdad()
	{
		return edad;
	}
	
	// se establece Nombre que tendra como parametro la variable nombre
	void setNombre(String nombre)
	{
		// se declara que la variable nombre declarada anteriormente es igual a la declarada en el set
		this.nombre = nombre;
	}
	
	// se establece Edad que tendra como parametro la variable edad
	void setEdad(int edad)
	{
		// se declara que la variable edad declarada anteriormente es igual a la declarada en el set
		this.edad = edad;
	}
}

