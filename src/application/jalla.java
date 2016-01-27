package application;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class jalla
{
	private int var=1;
	
	public void hei(String[] a)
	{
		for (String item:a)
		{
			System.out.println(item);
		}
	}

	public void setVar(int b)
	{
		var=b;
	}
	public int getVar()
	{
	
		return var;
	}
	
	public void tegnStjerner(int n)
	{
		JTextArea utskrift=new JTextArea();
		String tekst="";
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				tekst += "*  ";
			}
			tekst += "\n";
		}
		utskrift.setText(tekst);
		JOptionPane.showMessageDialog(null, utskrift);
		
	}
	public boolean sjekkStjerner(int n)
	{
		int sjekk=n;
		if (sjekk>0)
			return true;
		else return false;
		
		
	}
	
	public String returnerInnhold(String[] liste)
		{
			String tekst="";
			for (String a:liste)
				tekst +=a;
			return tekst;
		}
	}
				
			
	
	

