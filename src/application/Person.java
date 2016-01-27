package application;

public class Person 
{
	private String navn;
	private int alder;
	private static int antPersonobjekter=0;
	
	public Person(String n, int a)
	{
		navn=n;
		alder=a;
		antPersonobjekter++;
	}
	
	public String getNavn()
	{
		return navn;
	}
	public int getAlder()
	{
		return alder;
	}

	public int getantPersonobjekter()
	{
		return antPersonobjekter;
	}
	
	public String toString() 
	{
		return "Person [navn=" + navn + ", alder=" + alder + "]";
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}
	
}
