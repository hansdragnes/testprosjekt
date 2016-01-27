package application;

public class Miniliste 
{

	private Node first;
	
	public Miniliste(int antNoder)
	{
		first = new Node(0);
		Node runner=first;
		
		for (int i=1;i<antNoder;i++)
		{
			runner.next=new Node(i);
			runner=runner.next;
		}
	}
	
		
	public String getListedata()
	{
		String data="Listeinnhold:\n";
		Node runner=first;
		while(runner!=null)
		{
			data+=runner.getInfo()+"\n";
			runner=runner.next;
		}
		return data;
	}

	private class Node
	{
		private int info;
		Node next;
		
		public Node(int data)
		{
			info=data;
			next=null;
		}
		
		public int getInfo()
		{
			return info;
		}
	}

}

