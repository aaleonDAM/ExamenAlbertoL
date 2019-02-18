package Examen;

public class MainCadenas {
	
	public String Union(String cadena1, String cadena2)
	{
		String cadena3=cadena1+cadena2;
		return cadena3;
	}
	
	public String Mayus(String cadena1)
	{
		return cadena1.toUpperCase();
	}
	
	public int Digitos(String cadena1)
	{
		return cadena1.length();
	}
	
	public int Comparar(int num, int num2)
	{
		if(num>=num2)
			return 1;
		else
			return 0;
	}
	
	public int Cuadrado(int num)
	{
		return num*num;
	}
	
	public boolean Mayor10(int num)
	{
		if(num>=10)
			return true;
		else
			return false;
	}

}

