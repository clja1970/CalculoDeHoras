package es.pepecl.calculoDeHoras;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Modelo
{
	String horaFin;
	
	public Modelo()
	{

	}
	public void CalcularHoras(String horaInicial, String horaFinal)
	{
		//Scanner teclado = new Scanner(System.in);
		try
		{
			DateFormat df = new SimpleDateFormat ("HH:mm");
			//System.out.println("Dame una fecha inicial ");
			//horaInicial = teclado.next();
			Date horaUno = df.parse(horaInicial);
			//System.out.println("Dame la hora final ");
			//horaFinal = teclado.next();
			Date horaDos = df.parse(horaFinal);

			//teclado.close();

			long dif = horaDos.getTime() -horaUno.getTime();
			long horas = dif / (3600 * 1000);
			long minutos = dif /(60 * 1000) - horas * 60;

			//System.out.println(horas + " horas y " + minutos + " minutos");
			horaFin = (" Han pasado " + horas + " horas y " + minutos + " minutos");
			System.out.println(horaFin);
		}
		catch (ParseException e)
		{
			System.out.println("Formato invalido");
		}
	}
}