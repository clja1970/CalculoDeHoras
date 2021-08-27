package es.pepecl.calculoDeHoras;

public class CalculoHoras
{

	public static void main(String[] args)
	{
		Vista objVista = new Vista ();
		Modelo objModelo = new Modelo();
		
		new Controlador (objVista, objModelo);
	}

}
