package es.pepecl.calculoDeHoras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Vista objVista= null;
	Modelo objModelo= null;
	String horaUno;
	String horaDos;
	String resultado;
	
	
	public Controlador(Vista objVista, Modelo objModelo)
	{
		this.objVista= objVista;
		this.objModelo= objModelo;
		
		objVista.ventana.addWindowListener(this);
		objVista.btnCalcular.addActionListener(this);
		objVista.btnResetear.addActionListener(this);
		
		objVista.ventana.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent botonPulsado)
	{
		
		if(botonPulsado.getSource().equals(objVista.btnCalcular))
		{
		
			horaUno = objVista.txt1.getText();
			horaDos = objVista.txt2.getText();
			
			objModelo.CalcularHoras(horaUno, horaDos);
			//Pruebas
			System.out.println(objModelo.horaFin + " 2");
			
			objVista.txt3.setText(objModelo.horaFin);

		}
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}