package Examen;

import org.junit.Assert;
import org.junit.Test;

public class MainCadenasTest {
	MainCadenas mc=new MainCadenas();
	
	//Test de concatenacion
	@Test
	public void UnionTest()
	{
		String cadena1="Hola";
		String cadena2="Mundo";
		String cadena3=mc.Union(cadena1,cadena2); //Une las dos cadenas
		String esperado="HolaMundo";
		
		Assert.assertEquals(esperado, cadena3);  //Comprueba si el resultado es correcto
	}
	
	//Test de pasar a mayusculas
	@Test
	public void MayusTest()
	{
		String cadena="hola";
		cadena=mc.Mayus(cadena);  //Convierte a mayuscula la cadena
		String esperado="HOLA";
		
		Assert.assertEquals(esperado, cadena); //Comprueba si el resultado es correcto
	}
	
	@Test
	public void DigitosTest()
	{
		int num;
		String cadena="hola";
		num=mc.Digitos(cadena); //Comprueba cuantos digitos tiene la cadena
		int esperado=4;
		
		Assert.assertEquals(esperado, num); //Comprueba si el resultado es correcto
	}
	
	@Test
	public void CompararTest()
	{
		int num=3;
		int num2=4;
		int resultado=mc.Comparar(num, num2); //Compara los dos numero y devuelve si es mayor o menor
		int esperado=0;
		
		Assert.assertEquals(esperado, resultado); //Comprueba si el resultado es correcto
	}
	
	@Test
	public void CuadradoTest()
	{
		int num=3;
		int resultado=mc.Cuadrado(num); //Devuelve el cuadrado del numero
		int esperado=num*num;
		
		Assert.assertEquals(esperado, resultado); //Comprueba si el resultado es correcto
	}
	
	@Test
	public void Mayor10Test()
	{
		int num=3;
		boolean resultado=mc.Mayor10(num); //Comprueba si es mayor de 10
		boolean esperado=false;
		
		Assert.assertEquals(esperado, resultado); //Comprueba si el resultado es correcto
	}
}
	