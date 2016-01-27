package application;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.io.IOException;
import java.text.NumberFormat;


public class hans 
{
	public static void main(String[] args)
	{
		int x=10, y=20;
		
		Beregner sjekk= new Beregner();
		boolean resultat=sjekk.isEqual(x, y);
		int resultat2=sjekk.square(x);
		System.out.println("Resultat:\n "+resultat);
	}
	
}
