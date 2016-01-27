package application;
import javax.swing.JOptionPane;

public class Personregister 
{
	private int personer=0;
	Person[] pliste=null;
	
	public Personregister(int l)
	{
		pliste=new Person[l];
	}
	public void regNy()
	{
		String n;
		int a;
		int teller=pliste.length;
		Person p;
		
		
		for (int i=0;i<teller;i++)
		{
			
			n=JOptionPane.showInputDialog("Navn");
			a=Integer.parseInt(JOptionPane.showInputDialog("Alder"));
			p=new Person(n,a);
			pliste[i]=p;
			personer++;
		}
	}
	
	public String getPerson(int p)
	{
		if (p<=pliste.length)
			return pliste[0].toString();
		else
			return "Feil";
	}
	

}
