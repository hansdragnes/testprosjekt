package application;
import javax.swing.*;

@SuppressWarnings("serial")
public class Minilistetest extends JFrame
{
	private JTextArea output;
	
	public Minilistetest()
	{
		super("Minilistetest");
		
		output=new JTextArea(20,20);
		output.setEditable(false);
		getContentPane().add(output);
		Miniliste liste=new Miniliste(15);
		output.setText(liste.getListedata());
		
		setSize(200,400);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Minilistetest vindu=new Minilistetest();
		vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
