package es.pepecl.calculoDeHoras;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;



public class Vista
{
	Frame ventana = new Frame("Calculadora de horas");

	Label lbl1 = new Label("Desde");
	Label lbl2 = new Label("Hasta");
	Label lbl3 = new Label("Resultado");

	TextField txt1 = new TextField(10);
	TextField txt2 = new TextField(10);
	TextField txt3 = new TextField(20);

	Button btnCalcular = new Button("Calcular");
	Button btnResetear = new Button("Resetear");


	public Vista()
	{
		ventana.setLayout(new FlowLayout());

		ventana.add(lbl1);
		ventana.add(txt1);		
		ventana.add(lbl2);
		ventana.add(txt2);
		ventana.add(lbl3);
		ventana.add(txt3);
		ventana.add(btnCalcular);
		ventana.add(btnResetear);
		
		ventana.setBackground(Color.cyan);
		ventana.setSize(200, 270);
		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);


	}

}
